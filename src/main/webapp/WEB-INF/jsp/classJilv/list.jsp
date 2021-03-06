<%@ page import="com.xiaoyuan.util.Const" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="w" uri="http://javacrazyer.iteye.com/tags/pager" %>
<html>
<head>
    <%--<c:import url="../../common/pc/include.jsp"></c:import>--%>
    <title>学生纪律管理</title>
</head>
<body>

<div class="container-fluid">
    <c:import url="../../../common/include.jsp"></c:import>
    <div class="row">
        <c:import url="../../../common/header.jsp"></c:import>
    </div>
    <div class="row">
        <div class="col-md-2 leftdiv">
        </div>

        <!--右侧内容-->
        <div class="col-md-10" style="background: #fffcfa" >

            <a class="large blue button f-ml20 f-mt20" data-toggle="modal" data-target="#addModal" href="addClassJilv">新增违反纪律内容</a>
            <!-- Modal -->
            <div class="modal fade" id="addModal" class="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
                <div class="modal-dialog" role="document">
                    <div class="modal-content">

                    </div>
                </div>
            </div>

            <div class="panel-body" style="padding-bottom:0px;">
                <%--<div class="panel panel-default">--%>
                <%--<div class="panel-heading">查询条件</div>--%>
                <%--<div class="panel-body">--%>
                <%--<form id="formSearch" class="form-horizontal">--%>
                <%--<div class="form-group" style="margin-top:15px">--%>
                <%--<label class="control-label col-sm-1" class="kemuname" for="txt_search_name">科目名称</label>--%>
                <%--<div class="col-sm-3">--%>
                <%--<input type="text" class="form-control" id="txt_search_name" name="txt_search_name">--%>
                <%--</div>--%>

                <%--</div>--%>
                <%--</form>--%>
                <%--</div>--%>
                <%--</div>--%>







            </div>
            <table id="tb_roles" class="table table-bordered  table-hover  f-ml10">
                <thead class="label-success">
                <th data-valign="middle" data-align="center" >学生名称</th>
                <th data-valign="middle" data-align="center" >班级</th>
                <th data-valign="middle" data-align="center" >不遵守纪律内容</th>
                <th data-valign="middle" data-align="center" >纪录课程</th>
                <%--<th data-valign="middle" data-align="center" >创建时间</th>--%>

                <th>操作</th>
                </thead>
                <tbody>
                <c:forEach items="${tmClassJiLvs}" var="jilv">
                    <tr>
                        <td >${jilv.studentName}</td>
                        <td >${jilv.className}</td>
                        <td >${jilv.content}</td>
                        <td >${jilv.keCheng}</td>



                        <td>
                            <%--<a class="large green button f-mr20 myModel" data-toggle="modal" data-target="#editModal" href="editClassJilv?classJilvId=${jilv.id}">修改记录</a>--%>
                            <a class="large orange button f-mr20" data-toggle="modal" onclick="delStudentJilv(${jilv.id})">删除记录</a>
                                <%--<a class="large orange button f-mr20" data-toggle="modal" onclick="delBanji(${banji.ID})">分配学生</a>--%>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                <%--当前页数 总共数量 一页显示多少条--%>

            </table>
            <%--<w:pager pageNo="${pageShow.pageIndex}" recordCount="${pageShow.count}" pageSize="${pageShow.pageCount}" url="kemuList"></w:pager>--%>
        </div>

    </div>
</div>
</body>
</html>

<!-- 修改模态框 -->
<div class="modal fade" id="editModal" class="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
    <div class="modal-dialog" role="document">
        <div class="modal-content">

        </div>
    </div>
</div>

<script>

    /**
     * 每次清除数据
     */
    $("#editModal").on("hidden.bs.modal", function() {
        $(this).removeData("bs.modal");
    });
    /**
     * 每次清除数据
     */
    $("#addModal").on("hidden.bs.modal", function() {
        $(this).removeData("bs.modal");
    });

    function  delStudentJilv(jilvid) {
        var r= confirm("你确定要删除该纪律吗?");
        if(r){
            $.ajax({
                url:"delStudentJilv?jilvId="+jilvid,
                success:function (data) {
                    var obj = eval('('+data+')')
                    if(obj.status=="success"){
                        toastrSuccessMessage(obj.msg,"信息提示");
                        setTimeout(function () {
                            location.reload();
                        },1000)

                    }
                }
            })
        }

    }


</script>