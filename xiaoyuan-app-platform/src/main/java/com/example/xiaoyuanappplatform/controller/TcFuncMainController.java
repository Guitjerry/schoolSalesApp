package com.example.xiaoyuanappplatform.controller;

import com.example.xiaoyuanappplatform.entity.TcFunc;
import com.example.xiaoyuanappplatform.entity.TcRole;
import com.example.xiaoyuanappplatform.repository.TcFuncRepository;
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

@Controller
@RequestMapping("/func")
public class TcFuncMainController {
    @Autowired
    private TcFuncRepository tcFuncRepository;
    /**
     * 资源列表
     */
    @RequestMapping("/funcList")
    private  @ResponseBody
    Map<String,Object> funcList(HttpServletRequest request, String msg,Integer page,Integer limit){
        Map<String,Object> resultMap = new HashMap<>();
        request.setAttribute("data",msg);
        Pageable pageable = new PageRequest(page-1,limit);
        Long allcount = tcFuncRepository.count();
        Page<TcFunc> tcFuncPage = tcFuncRepository.findAll(pageable);
        resultMap.put("data",tcFuncPage.getContent());
        resultMap.put("msg","");
        resultMap.put("count",allcount);
        resultMap.put("code",0);
        return resultMap;
    }

    /**
     * 添加资源
     * @param response
     * @param tcFunc
     * @return
     */
    @RequestMapping("addFuncSure")
    private @ResponseBody Map<String,Object> addFuncSure(HttpServletResponse response, TcFunc tcFunc){
        Map<String,Object> resultMap = new HashMap<>();
        try{
            if(tcFunc!=null){
                tcFuncRepository.save(tcFunc);
            }
            if(tcFunc!=null&&tcFunc.getFuncId()>0){
                resultMap.put("successmsg","保存资源成功:");
            }
        }catch (Exception e){
            resultMap.put("errormsg","系统出错,保存资源失败");
        }

        return resultMap;
    }
    @RequestMapping("addChildFunc")
    private @ResponseBody Map<String,Object> addChildFunc(HttpServletResponse response, Integer parentFuncId){
        Map<String,Object> resultMap = new HashMap<>();
        try{
            if(parentFuncId!=null){
               TcFunc tcFunc = tcFuncRepository.findOne(parentFuncId);
               resultMap.put("obj",tcFunc);
            }
        }catch (Exception e){
            resultMap.put("errormsg","系统出错,保存资源失败");
        }

        return resultMap;
    }
    @RequestMapping("addChildFuncSure")
    private @ResponseBody Map<String,Object> addChildFuncSure(HttpServletResponse response, TcFunc tcFunc){
        Map<String,Object> resultMap = new HashMap<>();
        try{
            if(tcFunc!=null){
                tcFuncRepository.save(tcFunc);
                resultMap.put("successmsg","保存二级菜单成功");
            }
        }catch (Exception e){
            resultMap.put("errormsg","系统出错,保存资源失败");
        }

        return resultMap;
    }
    /**
     * 编辑资源
     * @param funcId
     * @param request
     * @return
     */
    @RequestMapping("editFunc")
    private @ResponseBody Map<String,Object> editFunc(Integer funcId,HttpServletRequest request){
        List<TcFunc> tcFuncs = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<>();
        if(funcId!=null){
            TcFunc tcFunc = tcFuncRepository.findOne(funcId);
            tcFuncs.add(tcFunc);
            resultMap.put("list",tcFuncs);
        }
        return resultMap;
    }
    /**
     * 删除资源
     */
    @RequestMapping("delFunc")
    private @ResponseBody Map<String,Object> delFunc(Integer funcId,HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<>();
        if(funcId!=null){
            TcFunc tcFunc = tcFuncRepository.findOne(funcId);
            tcFuncRepository.delete(tcFunc);
            resultMap.put("successmsg","删除角色成功");
        }
        return resultMap;
    }
    /**
     * 编辑资源确定
     */
    @RequestMapping("editFuncSure")
    private @ResponseBody Map<String,Object> editRoleSure(HttpServletRequest request,HttpServletResponse response,TcFunc tcFunc){
        Map<String,Object> resultMap = new HashMap<>();
        if(tcFunc!=null&&tcFunc.getFuncId()>0){
            tcFuncRepository.saveAndFlush(tcFunc);
            resultMap.put("successmsg","更新角色成功");
        }
        return  resultMap;
    }}
