<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<div class="panel panel-default">
    <div class="panel-thumbnail">
        <img src="/img/sms.png" class="img-responsive">
    </div>
    <div class="panel-body">
        <p>${pageNum} min</p>

        <p class="lead">SMS</p>

        <p>xx님으로부터</p>

        <p>고객님은 현재 5000만원까지 대출 가능하십니다. 좋은하루 되세요 </p>
        <hr>
        <form class="form-horizontal" role="form">
            <p>
                <textarea class="form-control" rows="1" placeholder="메모입력"></textarea>
            </p>
        </form>
    </div>

</div>
<div class="panel panel-default">
    <div class="panel-thumbnail">
        <img src="/img/call.png" class="img-responsive">
    </div>
    <div class="panel-body">
        <p>${pageNum} min</p>

        <p class="lead">Dial</p>

        <p>장소 : xx</p>

        <p>홍길동 님과 xx분 통화</p>
        <hr>
        <form class="form-horizontal" role="form">
            <p>
                <textarea class="form-control" rows="1" placeholder="메모입력"></textarea>
            </p>
        </form>
    </div>

</div>

<div class="panel panel-default">
    <div class="panel-thumbnail">
        <img src="/img/location.png" class="img-responsive">
    </div>
    <div class="panel-body">
        <p>${pageNum} min</p>

        <p class="lead">Location</p>

        <p>고객님은 ${pageNum}분 전에 xx에서 yy로 이동하셨습니다.</p>
        <hr>
        <form class="form-horizontal" role="form">
            <p>
                <textarea class="form-control" rows="1" placeholder="메모입력"></textarea>
            </p>
        </form>
    </div>

</div>

<div class="panel panel-default">    <div class="panel-thumbnail">        <img src="/img/bookmark.png" class="img-responsive">  </div>    <div class="panel-body">        <p>${pageNum} min</p>        <p class="lead">bookmark</p>        <p>장소 : xx</p>        <p><a href="#">http://tleaf.me</a> </p>        <hr>        <form class="form-horizontal" role="form">            <p>                <textarea class="form-control" rows="1" placeholder="메모입력"></textarea>            </p>        </form>    </div></div>
