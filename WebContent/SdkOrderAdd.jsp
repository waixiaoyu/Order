<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SDK订单添加</title>

<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
</head>

<body>
	<div>
		<div>
			<form action="sdkOrderAdd">
				<input type="hidden" name="shop_code" value="CS02"><br /> 



				<input type="hidden" name="title1" value="good1">商品1<br /> 
				商品号（SKU）：<input type="hidden" name="sku1" value="140405">140405<br /> 
				商品数量：<input type="text" name="number1"><br />
				<input type="hidden" name="price1" value="88.88"><br /> 


				<input type="hidden" name="title2" value="good2">商品2<br /> 
				商品号（SKU）：<input type="hidden" name="sku2" value="19090823">19090823<br /> 
				商品数量：<input type="text" name="number2"><br /> 
				<input type="hidden" name="price2" value="99.98"><br /> 


				<p>
				收货人姓名：<input type="text"	name="consignee"><br />
				电话：<input type="text"	name="phone"><br />
				省：<input type="text"	name="province"><br />
				市：<input type="text"	name="city"><br />
				区：<input type="text"	name="area"><br />
				邮编：<input type="text"	name="zipcode"><br />
				详细地址：<input type="text"	name="address"><br />

				<button id="getBtn" type="submit" class="btn btn-default">提交订单</button>
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
		<div>
			<p>交易号:</p>
			<p class="response" id="response" style="background-color: #CCC">${tidStr}</p>
		</div>
		<div>
			<p>物流单号:</p>
			<p class="response" id="response" style="background-color: #CCC">${expNoStr}</p>
		</div>
	</div>
</body>
</html>