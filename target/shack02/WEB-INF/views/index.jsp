<%--
  Created by IntelliJ IDEA.
  User: yoonsKim
  Date: 2014. 8. 18.
  Time: 오전 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>TLeaf Web</title>
    <meta name="generator" content="Bootply">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">


    <%--bootstrap import --%>
    <link href="/css/facebook/bootstrap.min.css" rel="stylesheet">


    <!--[if lt IE 9]>
    <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>

    <script src="/js/htmlparser.js"></script>
    <![endif]-->




    <%--custom CSS Position--%>
    <!-- Loading Flat UI -->



    <link href="/css/flat-ui.css" rel="stylesheet">
    <link href="/css/demo.css" rel="stylesheet">
    <%--facebook형태의 템플릿, flat-ui보다 위에 있어야 함--%>
    <link href="/css/facebook/styles.css" rel="stylesheet">

    <%--개발자가 직접 조정한 부분--%>
    <link href="/css/index_custom.css" rel="stylesheet">
    <link href="/css/animation.css" rel="stylesheet">




    <%--custom CSS Position End--%>


    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <%--오토 스크롤링 하는 부분. 추후에 js파일로 따로 만들고, 현재는 네비게이션 부분의 추가 작업으로 인해 여기에 둠--%>
    <script type="text/javascript" src="/js/autoscroll.js">

    </script>
    <%--<script type="text/javascript" src="/js/scroll/jquery.jscroll.js"></script>--%>
    <%--<script type="text/javascript" src="/js/scroll/jquery.jscroll.min.js"></script>--%>



</head>
<body>

<div class="wrapper">

    <div class="box">


        <div class="row row-offcanvas">
            <%--네비게이션 시작--%>

            <div class="navbar-inner">
                <nav class="navbar-inverse navbar-embossed" role="navigation">
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
                        <%--<li><a href="#">TLeaf</a></li>--%>

                        </ul>

                        <ul class="nav navbar-nav navbar-right">

                            <div class="nav navbar-nav navbar-form">

                                <div class="col-xs-12">

                                    <div class="form-group">
                                        <input type="text" value="" placeholder="search" class="form-control">
                                    </div>
                                </div>
                            </div>

                            <li><a href="#">my info</a></li>
                            <li><a href="#"> <span class="fui-mail"></span></a></li>
                            <li><a href="#fakelink"><span class="fui-gear"></span></a></li>
                        </ul>

                    </div>
                    <!-- /.navbar-collapse -->
                </nav>
            </div>
            <!-- 네비게이션 끝 -->

            <%--좌편 선택자 시작--%>
            <div class="column col-sm-2 col-xs-10" id="main" >
                <div class="pallete-item " >
                    <dl class="palette-silver">

                        <a id="all"href="#" class="btn-block btn-lg "><span class="fui-cmd">&nbsp;&nbsp;&nbsp;All</span></a>
                        <a id="location" href="#" class="btn-block btn-lg "><span class="fui-location">&nbsp;&nbsp;&nbsp;Location</span></a>
                        <a id="phone"href="#" class="btn-block btn-lg "><span class="fui-chat">&nbsp;&nbsp;&nbsp;Phone</span></a>
                        <a id="photo"href="#" class="btn-block btn-lg "><span class="fui-photo">&nbsp;&nbsp;&nbsp;Photo</span></a>
                        <a id="bookmark"href="#" class="btn-block btn-lg "><span class="fui-check">&nbsp;&nbsp;&nbsp;Bookmark</span></a>
                        <a id="sms" href="#" class="btn-block btn-lg "><span class="fui-mail">&nbsp;&nbsp;&nbsp;SMS</span></a>
                    </dl>

                </div>




            </div>
            <%--좌편 선택자 끝--%>

            <!-- 메인 포스팅시작  -->
            <div class="column col-sm-8 col-xs-10" id="main">

                <%--<button class="btn" value="btn"/>--%>
                <div class="padding">
                    <div class="col-sm-12">

                        <!-- content -->
                        <div class="row">

                            <!-- main col left -->
                            <%--실제 카드가 있는곳, 시작--%>
                            <div class="col-sm-9" id="cards">


                            </div>
                            <%--실제 카드가 있는곳 끝--%>
                            <!-- main col right -->

                            <%--로딩화면--%>
                            <div class="row">
                            <div id="container">
                                <div class="stick"></div>
                                <div class="stick"></div>
                                <div class="stick"></div>
                                <div class="stick"></div>
                                <div class="stick"></div>
                                <div class="stick"></div>

                                <h1>Loading...</h1>

                            </div>
                            </div>
                            <%--로딩화면 끝--%>
                        </div>
                        <!--/row-->


                        <div class="col-sm-6">
                            <a href="#">Twitter</a>
                            <small class="text-muted">|</small>
                            <a
                                    href="#">Facebook</a>
                            <small class="text-muted">|</small>
                            <a
                                    href="#">Google+</a>
                        </div>



                        <div class="col-sm-6"></div>
                        <div class="col-sm-6">
                            <p>
                                <a href="#" class="pull-right">©Copyright 2013</a>
                            </p>
                        </div>


                        <hr>


                        <hr>


                    </div>
                    <!-- /col-9 -->


                </div>
                <!-- /padding -->
            </div>
            <!-- 메인 포스팅 끝 -->
            <!-- sidebar -->
            <div class="column col-sm-2 col-xs-1 sidebar-offcanvas" id="sidebar" >



                <ul class="nav hidden-xs" id="lg-menu">
                    <li class="active"><a href="#featured"><i
                            class="glyphicon glyphicon-list-alt"></i> Featured</a></li>
                    <li><a href="#stories"><i
                            class="glyphicon glyphicon-list"></i> Stories</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-paperclip"></i>
                        Saved</a></li>
                    <li><a href="#"><i class="glyphicon glyphicon-refresh"></i>
                        Refresh</a></li>
                </ul>



            </div>
            <!-- /sidebar -->
        </div>

    </div>
</div>


<!--post modal-->
<div id="postModal" class="modal fade" tabindex="-1" role="dialog"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-hidden="true">×
                </button>
                Update Status
            </div>
            <div class="modal-body">
                <form class="form center-block">
                    <div class="form-group">
                        <textarea class="form-control input-lg" autofocus=""
                                  placeholder="What do you want to share?"></textarea>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <div>
                    <button class="btn btn-primary btn-sm" data-dismiss="modal"
                            aria-hidden="true">Post
                    </button>
                    <ul class="pull-left list-inline">
                        <li><a href=""><i class="glyphicon glyphicon-upload"></i></a></li>
                        <li><a href=""><i class="glyphicon glyphicon-camera"></i></a></li>
                        <li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- script references -->
<script
        src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>

</body>
</html>