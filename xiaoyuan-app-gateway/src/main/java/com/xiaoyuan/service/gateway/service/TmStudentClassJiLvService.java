package com.xiaoyuan.service.gateway.service;

import com.xiaoyuan.service.gateway.entity.TmStudentClassJiLv;

import java.util.List;

/**
 * 学生纪律
 */
public interface TmStudentClassJiLvService {
    public List<TmStudentClassJiLv> findAll();
    public List<TmStudentClassJiLv> findAllByRole(Integer userId);
    public List<TmStudentClassJiLv> findAllByStudent(String usercode);
}
