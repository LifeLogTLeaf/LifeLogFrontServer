jQuery(document).ready(function () {
    var link = 'lifelogs';
    $('#all').click(function() {
        //섹션을 바꿀때마다 초기화 하여 데이터 리로딩 
//        location.reload();
        $('#cards').remove();
        link='lifelogs';

    });
    $('#location').click(function() {
            //페이지 리로딩
//        location.reload();
        $('#cards').remove();
        link='locations';

    });
    $('#photo').click(function() {
        link='photos';
    });
    $('#phone').click(function() {
        link='phones';
    });
    $('#bookmark').click(function() {
        link='bookmarks';
    });
    $('#sms').click(function() {
        link='smss';
    });

//오토 스크롤을 감지 및 구현하는 부분
    $(window).scroll(function () {
        console.log($(document).height() + ", " + $(window).height() + " = " + $(window).scrollTop());
        if ($(window).scrollTop() == $(document).height() - $(window).height()) {

//                    console.log("catch");
            loadArticle(link,1,1);
        }
    });

//데이터를 ajax로 json데이터를 받아서 출력 해주는 함수
    function loadArticle(link,startNum,endNum) {
        $('#container').show('fast');//로딩화면 on
        var urlLink = "http://54.191.147.237:8080/lifelog/api/"+"lifelogs"+"?userid=jin";
        $.ajax({

            type:"GET",
            url:urlLink,
            contentType:"application/json",
//            data:"userid=jin",
            async:true,
            success:function(list){
//                console.log(data);
                console.log(list);

                var arrListData=list.data;
                var arrCount = list.count;

                var listLen = list.length;//json의 배열 사이즈
                var contentStr = "";
                $('#container').hide('1000');//로딩화면 off

                for(var i=0; i<arrCount; i++){
                    var arrData=arrListData[i];
                    if(arrData.logType=='bookmark'){
                        showBookmarkLayout(arrData);

                    }else if(arrListData[i].logType=='sms'){

                        showSmsLayout(arrData);
                    }else if(arrListData[i].logType=='call'){

                        showCallLayout(arrData);
                    }else if(arrListData[i].logType=='location'){

                        showLocationLayout(arrData);
                    }else if(arrListData[i].logType=='photo'){

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
            var time = new Date(arrData.logTime);
            var template = '<div class="panel panel-default"><div class="panel-thumbnail"><img src="/img/'+arrData.type+'.png" class="img-responsive"> </div> <div class="panel-body"> <p>'+time+ ' 분</p> <p class="lead">'+arrData.type+'</p> <p>장소 : '+arrData.latitude+', '+arrData.longitude+'</p> <p>'+arrData.title+' </p> <p>'+arrData.siteUrl+' </p> <hr> <form class="form-horizontal" role="form"> <p> <textarea class="form-control" rows="1" placeholder="메모입력"></textarea> </p> </form> </div></div>';

            console.log(time);
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


