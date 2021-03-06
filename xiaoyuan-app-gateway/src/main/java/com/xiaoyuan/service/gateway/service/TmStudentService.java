package com.xiaoyuan.service.gateway.service;

import com.xiaoyuan.service.gateway.entity.TmStudent;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by dnys on 2017/9/28.
 */
public interface TmStudentService {
    /**
     * 管理员查询班级信息
     * @return
     */
    public List<TmStudent> findAllStudent(String name, String usercode);
    public  List<TmStudent> findStudentByUserCodeAndPassword(String usercode, String password);
    public Long findAllCountByUserid(String name, String usercode, Integer userid);
    /**
     * 查询学生
     * @param pageable
     * @param name
     * @param usercode
     * @param userid
     * @param flag
     * @return
     */
    public List<TmStudent> findAllStudentByName(Pageable pageable, String name, String usercode, Integer userid, Boolean flag);
}
