package com.xiaoyuan.service.gateway.service;


import com.xiaoyuan.service.gateway.entity.TmClassJiLvChild;

import java.util.List;

/**
 * Created by dnys on 2018/1/8.
 */
public interface TmClassJiLvChildService {
    public List<TmClassJiLvChild> findAll();
    public List<TmClassJiLvChild> findAllByType();
}
