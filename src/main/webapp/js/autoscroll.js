jQuery(document).ready(function () {
//    var currentTimeMillis = new Date().getDate();
//
//    console.log("mills"+currentTimeMillis);
//    var month = currentTimeMillis.getMonth()+1;
//    console.log(month);
    var link = 'locations';
    $('#location').click(function() {
        location.reload();
        link='locations';
    });
    $('#photo').click(function() {
        location.reload();
        link='photos';
    });
    $('#phone').click(function() {
        location.reload();
        link='phones';
    });
    $('#bookmark').click(function() {
        location.reload();
        link='bookmarks';
    });
    $('#sms').click(function() {
        location.reload();
        link='smss';
    });


    $(window).scroll(function () {
        console.log($(document).height() + ", " + $(window).height() + " = " + $(window).scrollTop());
        if ($(window).scrollTop() == $(document).height() - $(window).height()) {

//                    console.log("catch");
            loadArticle(link,1,1);
        }
    });

    function loadArticle(link,startNum,endNum) {
        $('#container').show('fast');//로딩화면 on
        var urlLink = "http://54.191.147.237:8080/lifelog/api/"+link+"?userid=yoon";
        $.ajax({

            type:"GET",
            url:urlLink,
            contentType:"application/json",
            async:true,
            success:function(list){

                console.log(list);

                var arrListData=list.data;
                var arrCount = list.count;

                var listLen = list.length;//json의 배열 사이즈
                var contentStr = "";
                $('#container').hide('1000');//로딩화면 off

                for(var i=0; i<arrCount; i++){
                    var arrData=arrListData[i];
                    if(arrData.type=='bookmark'){
                        showBookmarkLayout(arrData);

                    }else if(arrListData[i].type=='sms'){

                        showSmsLayout(arrData);
                    }else if(arrListData[i].type=='call'){

                        showCallLayout(arrData);
                    }else if(arrListData[i].type=='location'){

                        showLocationLayout(arrData);
                    }else if(arrListData[i].type=='photo'){

                        showPhotoLayout(arrData);
                    }
                    else {
                        showBookmarkLayout(arrData);
                    }

                }

//                        $("#cards").append(json);
//                        $("#cards").append(contentStr);
            }
        })
        function showBookmarkLayout(arrData) {
            var template = '<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+arrData.logTime+ ' 분 전</p> <p class="lead">'+arrData.type+'</p> <p>장소 : '+arrData.latitude+', '+arrData.longitude+'</p> <p>'+arrData.title+' </p> <p>'+arrData.siteUrl+' </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>';
            $('#cards').append(template);
            return true;
        }
        function showSmsLayout(arrData) {
            var template ='<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+arrData.date+ ' 분 전에 수신됨</p> <p class="lead">'+arrData.type+'</p> <p>장소 : '+arrData.latitude+', '+arrData.longitude+'</p> <p>'+arrData.address+'님에게로부터 </p> <p>'+arrData.body+' </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>'
            $('#cards').append(template);
            return true;
        }
        function showCallLayout(arrData) {
            var template ='<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+arrData.logTime+ ' 분 전</p> <p class="lead">'+arrData.type+'</p> <p>장소 : '+arrData.latitude+', '+arrData.longitude+'</p> <p>'+arrData.name+'님과 x분 통화 </p> <p>'+arrData.number+' </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>';
            $('#cards').append(template);
            return true;
        }
        function showLocationLayout(arrData) {
            var template = '<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+arrData.logTime+ ' 분 전</p> <p class="lead">'+arrData.type+'</p> <p>장소 : '+arrData.latitude+', '+arrData.longitude+'</p>  <p> x에 있었습니다 </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>';
            $('#cards').append(template);
            return true;
        }
        function showPhotoLayout(arrData) {
            var template ='<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+arrData.logTime+ ' 분 전</p> <p class="lead">'+arrData.type+'</p> <p>'+arrData.latitude+', '+arrData.longitude+'에서 촬영</p> <p>'+arrData.fileName+' </p> <p>'+arrData.siteUrl+' </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>';
            $('#cards').append(template);
            return true;
        }
//

    }

});/**
 * Created by yoonsKim on 2014. 8. 18..
 */


