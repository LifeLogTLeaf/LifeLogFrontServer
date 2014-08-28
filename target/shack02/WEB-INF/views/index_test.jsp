<%--
  Created by IntelliJ IDEA.
  User: yoonsKim
  Date: 2014. 7. 28.
  Time: 오전 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<head>
    <title>mainPage</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <!-- Loading Bootstrap -->
    <link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
    <!-- Loading Flat UI -->
    <link href="/css/flat-ui.css" rel="stylesheet">
    <link href="/css/demo.css" rel="stylesheet">


    <link rel="shortcut icon" href="images/favicon.ico">
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.js"></script>
    <%--<script type="text/javascript" src="/js/scroll/jquery.jscroll.js"></script>--%>
    <%--<script type="text/javascript" src="/js/scroll/jquery.jscroll.min.js"></script>--%>

    <%--오토 스크롤링 하는 부분. 추후에 js파일로 따로 만들고, 현재는 네비게이션 부분의 추가 작업으로 인해 여기에 둠--%>
    <script type="text/javascript">
        jQuery(document).ready(function() {
//            var count = 2;
//            var count = 2;
            $(window).scroll(function(){
                console.log($(document).height()+", "+$(window).height()+" = " +$(window).scrollTop());
                if  (($(window).scrollTop()*1.15 >= $(document).height())||($(window).scrollTop()*1.1+500 >= $(document).height())){
                    console.log("catch");
                    loadArticle();
                    count++;
                }
            });

            function loadArticle(){
//                $('a#inifiniteLoader').show('fast');
                $.ajax({
                    url: 'index_data.do',
                    type:'POST',
                    data: "",
                    success: function(html){
//                        $('a#inifiniteLoader').hide('1000');
                        $("body").append(html); // This will be the div where our content will be loaded
                    }
                });
                return false;
            }

        });

    </script>

    <%--include js--%>
    <%--<script src="/js/bootstrap.js"/>--%>
    <%--<script src="/js/bootstrap.min.js"/>--%>
    <%--<%@include file="./css_meta.jspf"%>--%>
</head>
<body>

<%--navibar start--%>
<div class="row demo-row">
    <div class="col-xs-12">
        <nav class="navbar navbar-inverse navbar-embossed" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
                    <span class="sr-only">Toggle navigation</span>
                </button>
            </div>

            <div class="navbar-collapse collapse in" id="navbar-collapse-01" style="height: auto;">

                <ul class="nav navbar-nav navbar-left">
                    <li><a href="./index.do">HOME<span class="navbar-unread">1</span></a></li>
                    <li><a href="#">alerm</a></li>
                    <li><a href="#fakelink">Stack Log</a></li>

                </ul>

                <ul class="nav navbar-nav navbar-right">

                    <div class="nav navbar-nav navbar-form">

                        <div class="col-xs-4">
                            <div class="form-group">
                                <input type="text" value="" placeholder="search" class="form-control">
                            </div>
                        </div>
                    </div>

                    <li><a href="#">my info</a></li>
                    <li><a href="#"> <span class="fui-mail"></span></a></li>
                    <li><a href="#fakelink"><span class="fui-gear"></span></a></li>
                </ul>

            </div><!-- /.navbar-collapse -->
        </nav><!-- /navbar -->
    </div>

</div>
<%--navibar end--%>
<div class="container">
<div class="col-lg-12" align="center">
<h1  style="color:#23A41A;">TLeaf</h1>

<h2>레이아웃 메인 페이지</h2>
<h3>이제, 어디로 이동 할까요</h3>
</div>
</div>
</br>
<div id="navigation" align="center" style="width: 100%">
<a href="./location/list_location.do">위치로그 확인</a></br>
<a href="./location/add.do">위치 추가</a></br>
</div>


<%--Load JS--%>

<!-- Load JS here for greater good =============================-->
<%--<script src="js/jquery-1.8.3.min.js"></script>--%>
<%--<script src="js/jquery-ui-1.10.3.custom.min.js"></script>--%>
<script src="js/jquery.ui.touch-punch.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>
<script src="js/bootstrap-switch.js"></script>
<script src="js/flatui-checkbox.js"></script>
<script src="js/flatui-radio.js"></script>
<script src="js/jquery.tagsinput.js"></script>
<script src="js/jquery.placeholder.js"></script>
<script src="js/jquery.stacktable.js"></script>
<script src="http://vjs.zencdn.net/4.3/video.js"></script>
<script src="js/application.js"></script>



</body>
</html>
