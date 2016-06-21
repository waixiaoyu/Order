package com.prolto.demo.entity;

public class Sdk_order_detail {
	
	String title = "";
	String sku; // 商品sku 
	int num;    // sku数量 ,
	double goods_price; // 商品金额(单价) ,
	int return_starus;
	public Sdk_order_detail(String sku, int num, double goods_price) {
		super();
		this.sku = sku;
		this.num = num;
		this.goods_price = goods_price;
	}
	public Sdk_order_detail() {
		super();
	}
	@Override
	public String toString() {
		return "{\"title\":\"\",\"sku\":\"" + sku + "\",\"num\":\"" + num + "\",\"goods_price\":\"" + goods_price + "\",\"return_status\":\"0\"}";
	}
	
}
