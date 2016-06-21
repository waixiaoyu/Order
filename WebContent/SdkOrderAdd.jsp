<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SDK订单添加</title>

<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/getInfoByTid.js"></script>
</head>

<body>
	<div>
		<div>
			<form action="">
				商品号（SKU）：<input type="text" name="sku"><br /> 商品数量：<input
					type="text" name="number"><br /> 个人信息：<input type="text"
					name="info"><br />
				<button id="getBtn" type="submit" class="btn btn-default"
					onClick="javascript:doGet()">提交订单</button>
			</form>
		</div>
		<div>
			<p>请求URL:</p>
			<p class="url" id="url" style="background-color: #CCC"></p>
		</div>
		<div>
			<p>响应内容:</p>
			<p class="response" id="response" style="background-color: #CCC"></p>
		</div>
	</div>
</body>
</html>