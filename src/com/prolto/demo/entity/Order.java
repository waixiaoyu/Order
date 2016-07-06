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
	long consignee_doc_type;   // 收货人证件类型, 1身份证 2护照 3其他 , ,
	String consignee_doc_no ;   // 收货人证件号  ,
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
	
	public Order(String shop_code, String sellet_nick, String tid, int c_status, String status, String express_code,
			String user_nick, String consignee, String phone, String mobile, String email, String address,
			String province, String city, String area, String zipcode, long consignee_doc_type, String consignee_doc_no,
			String seller_flag, String buyer_remark, String seller_remark, double order_price, double postage,
			double cod_price, String order_time, String payment_time, int invoice_type, String invoice_title,
			String invoice_content, double invoice_amount, int payment_type, int distribution_status,
			String plat_lastchanged, int distribution_mode, String distribution_name, String express_no,
			String supplier, ArrayList<Sdk_order_detail> detail, Inline_Model_1 _custom) {
		super();
		this.shop_code = shop_code;
		this.sellet_nick = sellet_nick;
		this.tid = tid;
		this.c_status = c_status;
		this.status = status;
		this.express_code = express_code;
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
		this.consignee_doc_type = consignee_doc_type;
		this.consignee_doc_no = consignee_doc_no;
		this.seller_flag = seller_flag;
		this.buyer_remark = buyer_remark;
		this.seller_remark = seller_remark;
		this.order_price = order_price;
		this.postage = postage;
		this.cod_price = cod_price;
		this.order_time = order_time;
		this.payment_time = payment_time;
		this.invoice_type = invoice_type;
		this.invoice_title = invoice_title;
		this.invoice_content = invoice_content;
		this.invoice_amount = invoice_amount;
		this.payment_type = payment_type;
		this.distribution_status = distribution_status;
		this.plat_lastchanged = plat_lastchanged;
		this.distribution_mode = distribution_mode;
		this.distribution_name = distribution_name;
		this.express_no = express_no;
		this.supplier = supplier;
		this.detail = detail;
		this._custom = _custom;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [shop_code=" + shop_code + ", sellet_nick=" + sellet_nick + ", tid=" + tid + ", c_status="
				+ c_status + ", status=" + status + ", express_code=" + express_code + ", user_nick=" + user_nick
				+ ", consignee=" + consignee + ", phone=" + phone + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + ", province=" + province + ", city=" + city + ", area=" + area + ", zipcode="
				+ zipcode + ", seller_flag=" + seller_flag + ", buyer_remark=" + buyer_remark + ", seller_remark="
				+ seller_remark + ", order_price=" + order_price + ", postage=" + postage + ", cod_price=" + cod_price
				+ ", order_time=" + order_time + ", payment_time=" + payment_time + ", invoice_type=" + invoice_type
				+ ", invoice_title=" + invoice_title + ", invoice_content=" + invoice_content + ", invoice_amount="
				+ invoice_amount + ", payment_type=" + payment_type + ", distribution_status=" + distribution_status
				+ ", plat_lastchanged=" + plat_lastchanged + ", distribution_mode=" + distribution_mode
				+ ", distribution_name=" + distribution_name + ", express_no=" + express_no + ", supplier=" + supplier
				+ ", detail=" + detail + ", _custom=" + _custom + "]";
	}
	public String getShop_code() {
		return shop_code;
	}
	public long getConsignee_doc_type() {
		return consignee_doc_type;
	}
	public void setConsignee_doc_type(long consignee_doc_type) {
		this.consignee_doc_type = consignee_doc_type;
	}
	public String getConsignee_doc_no() {
		return consignee_doc_no;
	}
	public void setConsignee_doc_no(String consignee_doc_no) {
		this.consignee_doc_no = consignee_doc_no;
	}
	public void setShop_code(String shop_code) {
		this.shop_code = shop_code;
	}
	public String getSellet_nick() {
		return sellet_nick;
	}
	public void setSellet_nick(String sellet_nick) {
		this.sellet_nick = sellet_nick;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public int getC_status() {
		return c_status;
	}
	public void setC_status(int c_status) {
		this.c_status = c_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpress_code() {
		return express_code;
	}
	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSeller_flag() {
		return seller_flag;
	}
	public void setSeller_flag(String seller_flag) {
		this.seller_flag = seller_flag;
	}
	public String getBuyer_remark() {
		return buyer_remark;
	}
	public void setBuyer_remark(String buyer_remark) {
		this.buyer_remark = buyer_remark;
	}
	public String getSeller_remark() {
		return seller_remark;
	}
	public void setSeller_remark(String seller_remark) {
		this.seller_remark = seller_remark;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public double getPostage() {
		return postage;
	}
	public void setPostage(double postage) {
		this.postage = postage;
	}
	public double getCod_price() {
		return cod_price;
	}
	public void setCod_price(double cod_price) {
		this.cod_price = cod_price;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public String getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(String payment_time) {
		this.payment_time = payment_time;
	}
	public int getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(int invoice_type) {
		this.invoice_type = invoice_type;
	}
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	public String getInvoice_content() {
		return invoice_content;
	}
	public void setInvoice_content(String invoice_content) {
		this.invoice_content = invoice_content;
	}
	public double getInvoice_amount() {
		return invoice_amount;
	}
	public void setInvoice_amount(double invoice_amount) {
		this.invoice_amount = invoice_amount;
	}
	public int getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(int payment_type) {
		this.payment_type = payment_type;
	}
	public int getDistribution_status() {
		return distribution_status;
	}
	public void setDistribution_status(int distribution_status) {
		this.distribution_status = distribution_status;
	}
	public String getPlat_lastchanged() {
		return plat_lastchanged;
	}
	public void setPlat_lastchanged(String plat_lastchanged) {
		this.plat_lastchanged = plat_lastchanged;
	}
	public int getDistribution_mode() {
		return distribution_mode;
	}
	public void setDistribution_mode(int distribution_mode) {
		this.distribution_mode = distribution_mode;
	}
	public String getDistribution_name() {
		return distribution_name;
	}
	public void setDistribution_name(String distribution_name) {
		this.distribution_name = distribution_name;
	}
	public String getExpress_no() {
		return express_no;
	}
	public void setExpress_no(String express_no) {
		this.express_no = express_no;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public ArrayList<Sdk_order_detail> getDetail() {
		return detail;
	}
	public void setDetail(ArrayList<Sdk_order_detail> detail) {
		this.detail = detail;
	}
	public Inline_Model_1 get_custom() {
		return _custom;
	}
	public void set_custom(Inline_Model_1 _custom) {
		this._custom = _custom;
	}
	
}
