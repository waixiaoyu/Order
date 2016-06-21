package com.prolto.demo.entity;

import java.util.ArrayList;

public class Inline_Model_1 {

	String _custom_fld = "";
	ArrayList<Sdk_order_detail_cust> detall;
	public Inline_Model_1(String _custom_fld, ArrayList<Sdk_order_detail_cust> detall) {
		super();
		this._custom_fld = _custom_fld;
		this.detall = detall;
	}
	public Inline_Model_1() {
		super();
	}
	public String get_custom_fld() {
		return _custom_fld;
	}
	public void set_custom_fld(String _custom_fld) {
		this._custom_fld = _custom_fld;
	}
	public ArrayList<Sdk_order_detail_cust> getDetall() {
		return detall;
	}
	public void setDetall(ArrayList<Sdk_order_detail_cust> detall) {
		this.detall = detall;
	}
	
}
