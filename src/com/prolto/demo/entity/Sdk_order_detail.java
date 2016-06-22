package com.prolto.demo.entity;

public class Sdk_order_detail {

	String title = "";
	String sku = ""; // 商品sku
	int num = 0; // sku数量 ,
	double goods_price = 0; // 商品金额(单价) ,
	int return_starus = 0;

	public Sdk_order_detail(String title, String sku, int num, double goods_price) {
		super();
		this.title = title;
		this.sku = sku;
		this.num = num;
		this.goods_price = goods_price;
	}

	@Override
	public String toString() {
		return "Sdk_order_detail [title=" + title + ", sku=" + sku + ", num=" + num + ", goods_price=" + goods_price
				+ ", return_starus=" + return_starus + "]";
	}



}
