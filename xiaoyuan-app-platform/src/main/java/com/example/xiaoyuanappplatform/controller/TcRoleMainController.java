package com.example.xiaoyuanappplatform.controller;
import com.example.xiaoyuanappplatform.entity.TcRole;
import com.example.xiaoyuanappplatform.repository.TcRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 角色管理控制类
 */
@Controller
@RequestMapping("/role")
public class TcRoleMainController {
    @Autowired
    private TcRoleRepository tcRoleRepository;
//    @Autowired
//    private TmRoleResourceRepository tmRoleResourceRepository;
    @RequestMapping("addRoleSure")
    private @ResponseBody Map<String,Object> addRoleSure(HttpServletResponse response, TcRole tcRole){
        Map<String,Object> resultMap = new HashMap<>();
        try{
            if(tcRole!=null){
                tcRoleRepository.save(tcRole);
            }
            if(tcRole!=null&&tcRole.getRoleId()>0){
                resultMap.put("successmsg","保存角色成功:");
            }
        }catch (Exception e){
            resultMap.put("errormsg","系统出错,保存角色失败");
        }

        return resultMap;
    }
    /**
     * 编辑角色
     */
    @RequestMapping("editRole")
    private @ResponseBody Map<String,Object> editRole(Integer roleId,HttpServletRequest request){
        List<TcRole> tmRoles = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<>();
        if(roleId!=null){
            TcRole tmRole = tcRoleRepository.findOne(roleId);
            tmRoles.add(tmRole);
            resultMap.put("list",tmRoles);
        }
        return resultMap;
    }
    /**
     * 编辑角色
     */
    @RequestMapping("delRole")
    private @ResponseBody Map<String,Object> delRole(Integer roleId,HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<>();
        if(roleId!=null){
            TcRole tmRole = tcRoleRepository.findOne(roleId);
            tcRoleRepository.delete(tmRole);
            resultMap.put("successmsg","删除角色成功");
        }
        return resultMap;
    }
    /**
     * 编辑角色
     */
    @RequestMapping("editRoleSure")
    private @ResponseBody Map<String,Object> editRoleSure(HttpServletRequest request,HttpServletResponse response,TcRole existmRole){
        Map<String,Object> resultMap = new HashMap<>();
        if(existmRole!=null&&existmRole.getRoleId()>0){
            tcRoleRepository.saveAndFlush(existmRole);
            resultMap.put("successmsg","更新角色成功");
        }
        return  resultMap;
    }
    /**
     * 角色列表
     */
    @RequestMapping("/roleList")
    private  @ResponseBody  Map<String,Object>  roleList(HttpServletRequest request,String msg,Integer page,Integer limit){
        Map<String,Object> resultMap = new HashMap<>();
        //构建pageable
        Pageable pageable = new PageRequest(page-1,limit);
        Long allcount =tcRoleRepository.count();//总数量
        Page<TcRole> tcRolePage = tcRoleRepository.findAll(pageable);
        resultMap.put("data",tcRolePage);
        resultMap.put("msg","");
        resultMap.put("count",allcount);
        resultMap.put("code",0);
        return resultMap;
    }
//    /**
//     * 角色列表
//     */
//    @RequestMapping("/roleListJson")
//    private void roleListJson(HttpServletRequest request,HttpServletResponse response,String msg){
//        request.setAttribute("msg",msg);
//        List<TmRole> tmRoles = tmRoleRepository.findAll();
//        JsonUtilTemp.returnJson(tmRoles,response);
//    }
//    /**
//     * 分配资源
//     */
//    @RequestMapping("fpResource")
//    private String fpResource(HttpServletRequest request,String roleid){
//        List<TmResource> resources =  tmResourceService.findAll();
//        request.setAttribute("resources",resources);
//        request.setAttribute("roleid",roleid);
//        List<TmRoleResource> tmRoleResources =  tmRoleResourceRepository.findAllByroleid(Integer.valueOf(roleid));
//        request.setAttribute("selectresource",tmRoleResources);
//        return "role/fpResource";
//    }

}
