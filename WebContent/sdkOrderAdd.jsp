<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<!-- saved from url=(0054)http://v3.bootcss.com/examples/starter-template/#about -->
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://v3.bootcss.com/favicon.ico">

    <title>测试系统</title>

    <!-- Bootstrap core CSS -->
    <link href="./bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./bootstrap/starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./bootstrap/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="./sdkOrderAdd.jsp">测试页面</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="./getInfoByTid.jsp">交易号查询订单测试</a></li>
            <li class="active"><a href="./sdkOrderAdd.jsp">添加订单测试</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

  
    
<form action="sdkOrderAdd"> 
<input type="hidden" name="shop_code" value="CS02"><br /> 

<div class="panel panel-default">
  <div class="panel-heading">商品1</div>
  <div class="panel-body">
            <input type="hidden" name="title1" value="good1">商品1<br /> 
        <label for="name">商品号（SKU）</label>
        <input type="hidden" name="sku1" value="140405">140405<br /> 
        <label for="name">商品数量</label>
        <input type="text" name="number1"><br />
        <input type="hidden" name="price1" value="88.88"><br /> 

  </div>
</div>

<div class="panel panel-default">
  <div class="panel-heading">商品2</div>
  <div class="panel-body">
          <input type="hidden" name="title2" value="good2">商品2<br /> 
        <label for="name">商品号（SKU）</label>
        <input type="hidden" name="sku2" value="19090823">19090823<br /> 
        <label for="name">商品数量</label>
        <input type="text" name="number2"><br /> 
        <input type="hidden" name="price2" value="99.98"><br /> 
  </div>
</div>


<div class="panel panel-default">
  <div class="panel-heading">输入收货信息</div>
  <div class="panel-body">
        收货人姓名：<input type="text"  name="consignee"><br />
        电话：<input type="text" name="phone"><br />
        省：<input type="text"  name="province"><br />
        市：<input type="text"  name="city"><br />
        区：<input type="text"  name="area"><br />
        邮编：<input type="text" name="zipcode"><br />
        详细地址：<input type="text" name="address"><br />
        <button id="getBtn" type="submit" class="btn btn-default">提交订单</button>
  </div>
</div>     

        
      </form>

 <div class="panel panel-default">
  <div class="panel-body">
    <div>
      <label for="name">请求URL</label>
      <div class="alert alert-danger">${urlStr}</div>
    </div>
    <div>
      <label for="name">响应内容</label>
      <div class="alert alert-danger">${responseStr}</div>
    </div>
    <div>
      <label for="name">交易号</label>
      <div class="alert alert-danger">${tidStr}</div>
    </div>
    <div>
      <label for="name">物流单号</label>
      <div class="alert alert-danger">${expNoStr}</div>
    </div>
  </div>
</div>
    



    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./bootstrap/jquery.min.js"></script>
    <script src="./bootstrap/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./bootstrap/ie10-viewport-bug-workaround.js"></script>
  

</body></html>