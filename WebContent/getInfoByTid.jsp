<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>

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
          <a class="navbar-brand" href="./getInfoByTid.jsp">测试页面</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="./getInfoByTid.jsp">交易号查询订单测试</a></li>
            <li><a href="./sdkOrderAdd.jsp">添加订单测试</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

</p>
    <div class="container">




<div class="panel panel-default">
  <div class="panel-body">
          <form action="getInfoByTid">

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">店铺号</span>
  <input type="text" name="shop_code" class="form-control" placeholder="shop code" aria-describedby="basic-addon1">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">交易号</span>
  <input type="text" name="tid" class="form-control" placeholder="tid" aria-describedby="basic-addon1">
</div>

        <button id="getBtn" type="submit" class="btn btn-default">查询</button>
      </form>
  </div>
</div>

		<ul class="nav nav-list">
		  <li class="divider"></li>
		</ul>

<div class="panel panel-default">
  <div class="panel-body">
       <div>
      <label for="name">请求URL</label>
      <div class="alert alert-danger">
      ${urlStr}
      </div>
    </div>
    <div>
      <label for="name">响应内容</label>
      <div class="alert alert-danger">
      ${responseStr}
      </div>
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