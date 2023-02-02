package com.qxw.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxw.common.utils.PageUtils;
import com.qxw.common.utils.Query;

import com.qxw.gulimall.product.dao.CategoryDao;
import com.qxw.gulimall.product.entity.CategoryEntity;
import com.qxw.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {



    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listByTree() {
        //所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //组装
        List<CategoryEntity> level1Menu = entities.stream().filter(e -> e.getParentCid() == 0)
                .map((e)->{e.setChildren(getChildrens(e,entities)); return e;})
                .sorted(Comparator.comparingInt(e -> (e.getSort() == null ? 0 : e.getSort())))
                .collect(Collectors.toList());
        return level1Menu;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream()
                .filter((e) -> e.getParentCid().equals(root.getCatId()))
                .map((e)->{e.setChildren(getChildrens(e,all)); return e;})
                .sorted(Comparator.comparingInt(e -> (e.getSort() == null ? 0 : e.getSort())))
                .collect(Collectors.toList());
        return children;
    }

}