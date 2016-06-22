<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>以交易号查询订单信息</title>

<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/getInfoByTid.js"></script>
</head>

<body>
	<div>
		<div>
			<form action="getInfoByTid">
				店铺号：<input type="text" name="shop_code"><br /> 交易号：<input
					type="text" name="tid"><br />
				<button id="getBtn" type="submit" class="btn btn-default">查询</button>
			</form>
		</div>
		<div>
			<p>请求URL:</p>
			<p class="url" id="url" style="background-color: #CCC">${urlStr}</p>
		</div>
		<div>
			<p>响应内容:</p>
			<p class="response" id="response" style="background-color: #CCC">${responseStr}</p>
		</div>
	</div>
</body>
</html>