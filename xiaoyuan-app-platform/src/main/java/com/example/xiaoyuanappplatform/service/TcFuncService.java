package com.example.xiaoyuanappplatform.service;

import com.example.xiaoyuanappplatform.entity.TcFunc;

import java.util.List;

public interface TcFuncService {
    /**
     * 查询父级
     * @return
     */
    public List<TcFunc> findAllParent();
}
