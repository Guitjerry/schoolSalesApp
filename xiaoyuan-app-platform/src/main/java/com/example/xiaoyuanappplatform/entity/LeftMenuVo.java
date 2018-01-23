package com.example.xiaoyuanappplatform.entity;

import java.util.List;

public class LeftMenuVo {
    private  String parentdiv;//主菜单
    private String  childreli;//子菜单
    private List<TcFunc> parentFuncList;//主菜单
    private List<TcFunc> childFunList;//子菜单

    public String getParentdiv() {
        return parentdiv;
    }

    public void setParentdiv(String parentdiv) {
        this.parentdiv = parentdiv;
    }

    public String getChildreli() {
        return childreli;
    }

    public void setChildreli(String childreli) {
        this.childreli = childreli;
    }

    public List<TcFunc> getParentFuncList() {
        return parentFuncList;
    }

    public void setParentFuncList(List<TcFunc> parentFuncList) {
        this.parentFuncList = parentFuncList;
    }

    public List<TcFunc> getChildFunList() {
        return childFunList;
    }

    public void setChildFunList(List<TcFunc> childFunList) {
        this.childFunList = childFunList;
    }
}
