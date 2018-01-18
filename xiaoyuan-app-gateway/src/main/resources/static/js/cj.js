var  usercode =getParams('usercode');

function getParams(key) {
    var reg = new RegExp("(^|&)" + key + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
};
//查询作业
function zuoyeList(usercode) {
    var zuoyehtml = "";

    myAjax.myRequest(rootPath+"/app/score/checkZuoyeList", {usercode:usercode}, null, true, function(data) {
        if(data.obj!=undefined&&data.obj!=''){
            for(var i in data.obj){
                var banjiname = data.obj[i].banjiname;
                var kemuname = data.obj[i].kemuname;
                var task = data.obj[i].task;
                var zuoyeli = '<a class="weui-media-box weui-media-box_appmsg no_undeline">'+
                    '<div class="weui-media-box__hd">'+
                    '<div class="title">'+banjiname+'</div>'+
                    '</div>'+
                    '<div class="weui-media-box__bd">'+
                    '<h4 class="weui-media-box__title">'+kemuname+'</h4>'+
                    '<p class="weui-media-box__desc">'+task+'</p>'+
                    '</div>'+
                    '</a>';
                zuoyehtml+=zuoyeli;

            }
            $('.zuoyebody').html($(zuoyehtml));
        }
    })
}
//查询考勤
function kaoqingList(usercode) {
    var kaoqinghtml = "";

    myAjax.myRequest(rootPath+"/app/score/checkKaoqingList", {usercode:usercode}, null, true, function(data) {
        if(data.obj!=undefined&&data.obj!=''){
            for(var i in data.obj){
                var keCheng = data.obj[i].keCheng;
                var content = data.obj[i].content;
                var jilvName = data.obj[i].jilvName;
                var kaoqingli = '<a class="weui-media-box weui-media-box_appmsg no_undeline">'+
                    '<div class="weui-media-box__hd">'+
                    '<div class="title">'+jilvName+'</div>'+
                    '</div>'+
                    '<div class="weui-media-box__bd">'+
                    '<h4 class="weui-media-box__title">'+keCheng+'</h4>'+
                    '<p class="weui-media-box__desc">'+content+'</p>'+
                    '</div>'+
                    '</a>';
                kaoqinghtml+=kaoqingli;

            }
            $('.kaoqinbody').html($(kaoqinghtml));
        }
    })
}
$(function () {
    zuoyeList(usercode);
    cjList(usercode);
    kaoqingList(usercode);
})
function  showquxian(dict) {
    var canvas=document.getElementById('canvas');
    var context=canvas.getContext('2d');
//绘制起始点、控制点、终点
    context.beginPath();
    context.fillStyle = '#666';

    for(var j=1;j<4;j++){
        context.fillText(100*j+'名', 0, 100*j, 100);//画文字
    }

    context.fillText('名次(由高到低)', 0, 10, 50);//画文字
    context.stroke();
    context.fillStyle = 'red';
    x=200;
    y=400;
    for(var i=0;i<dict.length;i++){

        if(i==0&&dict.length==1){
            context.lineTo(0,dict[i].nianjiindexs);
            context.lineTo(400,dict[i].nianjiindexs);
            context.fillText("第"+dict[i].nianjiindexs+"名", 0 , dict[i].nianjiindexs-10,100);
        }else{
            context.lineTo(x*i,dict[i].nianjiindexs);

            context.fillText("第"+dict[i].nianjiindexs+"名", x*i+6 , Number(dict[i].nianjiindexs)+10,100);

        }

        context.fillText(dict[i].schoolTest, x*i , canvas.height-10 , 100);//画文字
        context.stroke();
    }


//        context.moveTo(0,400);
//        context.lineTo(100,400-47);
//        context.lineTo(200,400-380);
//        context.stroke();
//        x=100;
//        y=400;
//        for(var i=0;i<dict.length;i++){
//
//            if(i==0){
////                context.arc(0, dict[i].y, 2, 0, 2*Math.PI);//画点
//                context.lineTo(0,dict[i].y);
//
//            }else{
////                context.arc(x*i, dict[i].y, 2, 0, 2*Math.PI);//画点
//                context.lineTo(x*i,dict[i].y);
//
//            }
//
//
//            context.fillStyle = "#d1af8d";
////            context.fillText(dict[i].x, x*i + 3, canvas.height - 10, 100);//画文字
//
//            context.fill();
//            context.fillText(dict[i].y, x + 3, y - 10);
//            context.stroke();
//        }


}

// $(function(){
//     var dict = [
//         {x: "2017期中排名", y: 47},
//         {x: "2017期末排名", y: 2},
//         {x: "2018期中排名", y: 380}
//     ]
//     showquxian(dict);
// });
function cjList(usercode){
    var ths = "";

    myAjax.myRequest(rootPath+"/app/score/checkCJList", {usercode:usercode}, null, true, function(data) {
        if(data.obj!=undefined&&data.obj!=''){
            for(var i in data.obj){
                var tds ="";
                if(i==0){
                    ths+='<th>考试名称</th>';
                }
                tds +='<td>'+data.obj[i].schoolTest+'</td>';
                if(data.obj[i].dili!=undefined&&data.obj[i].dili!=null&&data.obj[i].dili!=''){
                    if(i==0){
                        ths+='<th>地理</th>';
                    }
                    tds +='<td>'+data.obj[i].dili+'</td>';
                }
                if(data.obj[i].huaxue!=undefined&&data.obj[i].huaxue!=null&&data.obj[i].huaxue!=''){
                    if(i==0){
                        ths+='<th>化学</th>';
                    }
                    tds +='<td>'+data.obj[i].huaxue+'</td>';
                }
                if(data.obj[i].lishi!=undefined&&data.obj[i].lishi!=null&&data.obj[i].lishi!=''){
                    if(i==0){
                        ths+='<th>历史</th>';
                    }
                    tds +='<td>'+data.obj[i].lishi+'</td>';
                }
                if(data.obj[i].shengwu!=undefined&&data.obj[i].shengwu!=null&&data.obj[i].shengwu!=''){
                    if(i==0){
                        ths+='<th>生物</th>';
                    }
                    tds +='<td>'+data.obj[i].shengwu+'</td>';
                }
                if(data.obj[i].shixiang!=undefined&&data.obj[i].shixiang!=null&&data.obj[i].shixiang!=''){
                    if(i==0){
                        ths+='<th>思想</th>';
                    }
                    tds +='<td>'+data.obj[i].shixiang+'</td>';
                }
                if(data.obj[i].wuli!=undefined&&data.obj[i].wuli!=null&&data.obj[i].wuli!=''){
                    if(i==0){
                        ths+='<th>物理</th>';
                    }
                    tds +='<td>'+data.obj[i].wuli+'</td>';
                }

                if(i==0){
                    ths+='<th>总分</th>';
                    ths+='<th>班级排名</th>';
                    ths+='<th>年级排名</th>';
                }
                tds +='<td>'+data.obj[i].sumCount+'</td>';
                tds +='<td>'+data.obj[i].banjiindexs+'</td>';
                tds +='<td>'+data.obj[i].nianjiindexs+'</td>';
                // thheader.append(ths);
                showquxian(data.obj);
                tds = '<tr>'+tds+'</tr>';
                $('.cjbody').append(tds);
            }


        }else{
            toastrErrorMessage(data.errormsg);
        }
        $('.cjtable').append(ths);


    })


}