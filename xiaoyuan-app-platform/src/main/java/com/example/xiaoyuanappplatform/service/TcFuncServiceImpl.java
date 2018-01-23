package com.example.xiaoyuanappplatform.service;

import com.example.xiaoyuanappplatform.entity.TcFunc;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class TcFuncServiceImpl implements TcFuncService{
    @PersistenceContext
    protected EntityManager em;
    @Override
    public List<TcFunc> findAllParent() {
        String hql = " from TcFunc where parFuncId is null";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }
}
