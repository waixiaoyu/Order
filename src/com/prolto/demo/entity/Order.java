package com.prolto.demo.entity;

import java.util.ArrayList;

public class Order {
	String shop_code; //店铺code 
	String sellet_nick;
	String tid;       //交易号 
	int c_status = 1;     // 公用订单标识 0待付款 1待发货 2已发货 3已关闭 4已锁定 ,
	String status;
	String express_code;
	String user_nick; //用户昵称 ,
	String consignee; // 收货人 ,
	String phone;     //固定电话 ,
	String mobile;    // 手机号码 ,
	String email;     // 邮箱 ,
	String address;   //收货人地址 ,
	String province;  // 省 ,
	String city;      // 市 ,
	String area;      // 区 ,
	String zipcode;   // 邮编 ,
	String seller_flag;
	String buyer_remark; // 买家备注 ,
	String seller_remark;// 卖家备注 ,
	double order_price;  // 订单金额 ,
	double postage;      // 邮费 ,
	double cod_price;
	String order_time;   // 下单时间 ,
	String payment_time; // 付款时间 ,
	int invoice_type;    // 发票类型 0无发票 1普通发票 2增值税发票 ,
	String invoice_title;// 发票抬头 ,
	String invoice_content;// 发票内容 ,
	double invoice_amount; // 发票金额 ,
	int payment_type;      // 支付类型 0非货到付款 1货到付款 ,
	int distribution_status;
	String plat_lastchanged;//最后变化时间
	int distribution_mode;
	String distribution_name;
	String express_no;
	String supplier;
	ArrayList<Sdk_order_detail> detail;
	Inline_Model_1 _custom;
	public Order(String shop_code, String tid, String user_nick, String consignee, String phone, String mobile,
			String email, String address, String province, String city, String area, String zipcode,
			String buyer_remark, String seller_remark, double order_price, double postage, String order_time,
			String payment_time, int invoice_type, String invoice_title, String invoice_content, double invoice_amount,
			int payment_type, ArrayList<Sdk_order_detail> detail) {
		super();
		this.shop_code = shop_code;
		this.tid = tid;
		this.user_nick = user_nick;
		this.consignee = consignee;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.province = province;
		this.city = city;
		this.area = area;
		this.zipcode = zipcode;
		this.buyer_remark = buyer_remark;
		this.seller_remark = seller_remark;
		this.order_price = order_price;
		this.postage = postage;
		this.order_time = order_time;
		this.payment_time = payment_time;
		this.invoice_type = invoice_type;
		this.invoice_title = invoice_title;
		this.invoice_content = invoice_content;
		this.invoice_amount = invoice_amount;
		this.payment_type = payment_type;
		this.detail = detail;
	}
	public Order() {
		super();
	}
	
}
