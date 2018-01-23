package com.example.xiaoyuanappplatform.controller;

import com.example.xiaoyuanappplatform.entity.TmRole;
import com.example.xiaoyuanappplatform.repository.TmRoleRepository;
import com.example.xiaoyuanappplatform.repository.TmRoleResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class TmRoleMainController {
    @Autowired
    private TmRoleRepository tmRoleRepository;
    @Autowired
    private TmRoleResourceRepository tmRoleResourceRepository;
    @RequestMapping("addRoleSure")
    private @ResponseBody Map<String,Object> addRoleSure(HttpServletResponse response, TmRole tmRole){
        Map<String,Object> resultMap = new HashMap<>();
        try{
            if(tmRole!=null){
                tmRoleRepository.save(tmRole);
            }
            if(tmRole!=null&&tmRole.getId()>0){
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
    private @ResponseBody Map<String,Object> editRole(Integer roleid,HttpServletRequest request){
        List<TmRole> tmRoles = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<>();
        if(roleid!=null){
            TmRole tmRole = tmRoleRepository.findOne(roleid);
            tmRoles.add(tmRole);
            resultMap.put("list",tmRoles);
        }
        return resultMap;
    }
    /**
     * 编辑角色
     */
    @RequestMapping("delRole")
    private @ResponseBody Map<String,Object> delRole(Integer roleid,HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<>();
        if(roleid!=null){
            TmRole tmRole = tmRoleRepository.findOne(roleid);
            tmRoleRepository.delete(tmRole);
            resultMap.put("successmsg","删除角色成功");
        }
        return resultMap;
    }
    /**
     * 编辑角色
     */
    @RequestMapping("editRoleSure")
    private @ResponseBody Map<String,Object> editRoleSure(HttpServletRequest request,HttpServletResponse response,TmRole existmRole){
        Map<String,Object> resultMap = new HashMap<>();
        if(existmRole!=null&&existmRole.getId()>0){
            tmRoleRepository.saveAndFlush(existmRole);
            resultMap.put("successmsg","更新角色成功");
        }
        return  resultMap;
    }
    /**
     * 角色列表
     */
    @RequestMapping("/roleList")
    private  @ResponseBody  Map<String,Object>  roleList(HttpServletRequest request,String msg){
        Map<String,Object> resultMap = new HashMap<>();
        request.setAttribute("data",msg);
        List<TmRole> tmRoles = tmRoleRepository.findAll();
        resultMap.put("data",tmRoles);
        resultMap.put("msg","");
        resultMap.put("count",tmRoles.size());
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
