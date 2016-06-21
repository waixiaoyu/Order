package com.prolto.demo.entity;

public class Sdk_order_detail_cust {
	String sku = "";
	String _custom_fld = "";
	public Sdk_order_detail_cust() {
		super();
	}
	public Sdk_order_detail_cust(String sku) {
		super();
		this.sku = sku;
	}
	public Sdk_order_detail_cust(String sku, String _custom_fld) {
		super();
		this.sku = sku;
		this._custom_fld = _custom_fld;
	}
}
