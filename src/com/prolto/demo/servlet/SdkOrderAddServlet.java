package com.prolto.demo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.prolto.demo.entity.Order;
import com.prolto.demo.entity.Sdk_order_detail;
import com.prolto.demo.utils.HttpRequest;
import com.prolto.demo.utils.MD5;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class SdkOrderAddServlet
 */
@WebServlet(name = "SdkOrderAddServlet", urlPatterns = "/sdkOrderAdd")
public class SdkOrderAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Order order;
	private static final String APP_KEY = "1464319303";
	private static final String APP_SECRET = "14643193030389";
	private static final String METHOD = "oms.SdkOrderAdd";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SdkOrderAddServlet() {
		super();
		this.order = new Order();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SdkOrderAddServlet");
		fillOrder(request);

		Gson gson = new Gson();
		String strOrderJson = gson.toJson(order);

		System.out.println(strOrderJson);

		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String test = APP_SECRET + "app_key" + APP_KEY + "method" + METHOD + "order" + strOrderJson + "timestamp" + time
				+ APP_SECRET;
		String md5Str = MD5.getMD5(test.getBytes()).toUpperCase();
		String url = "http://120.24.59.88/oms/webservice.php";
		String param = "app_key=" + APP_KEY + "&method=" + METHOD + "&order=" + strOrderJson + "&timestamp=" + time
				+ "&app_sign=" + md5Str;

		String responseStr = HttpRequest.sendGet(url, param);
		System.out.println(responseStr);
		String urlStr = url + "?" + param;
		String tidStr=order.getTid();
		String expNoStr=order.getExpress_no();

		request.setAttribute("urlStr", urlStr);
		request.setAttribute("responseStr", responseStr);
		request.setAttribute("tidStr", tidStr);
		request.setAttribute("expNoStr", expNoStr);

		ServletContext sc = getServletContext();
		sc.getRequestDispatcher("/sdkOrderAdd.jsp").forward(request, response);

		System.out.println(urlStr);
	}

	private void fillOrder(HttpServletRequest request) {
		// 设定隐藏域中的参数
		order.setShop_code(request.getParameter("shop_code"));
		// 设定其他必填参数
		order.setTid(String.valueOf(System.currentTimeMillis()));// 以当前时间暂定为Tid
		order.setC_status(0);
		order.setStatus("status");
		order.setSellet_nick("mySellerNike");
		order.setUser_nick("myUserNike");
		order.setBuyer_remark("myBuyerRemark");
		order.setSeller_remark("mySellerRemark");
		order.setOrder_price(100.88);
		order.setPostage(10);
		order.setCod_price(5);
		order.setOrder_time(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		order.setPayment_type(0);
		order.setDistribution_status(0);
		order.setPlat_lastchanged(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		order.setExpress_no(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

		// 设定表单中的参数
		String title1 = request.getParameter("title1");
		String sku1 = request.getParameter("sku1");
		String number1 = request.getParameter("number1");
		String price1 = request.getParameter("price1");
		String title2 = request.getParameter("title2");
		String sku2 = request.getParameter("sku2");
		String number2 = request.getParameter("number2");
		String price2 = request.getParameter("price2");

		Sdk_order_detail sod1 = new Sdk_order_detail(title1, sku1, isInteger(number1) ? Integer.valueOf(number1) : 0,
				Double.valueOf(price1));
		Sdk_order_detail sod2 = new Sdk_order_detail(title2, sku2, isInteger(number2) ? Integer.valueOf(number2) : 0,
				Double.valueOf(price2));
		ArrayList<Sdk_order_detail> lSods = new ArrayList<Sdk_order_detail>();
		lSods.add(sod1);
		lSods.add(sod2);

		String consignee = request.getParameter("consignee");
		String phone = request.getParameter("phone");
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String area = request.getParameter("area");
		String zipcode = request.getParameter("zipcode");
		String address = request.getParameter("address");
		order.setConsignee(consignee);
		order.setPhone(phone);
		order.setProvince(province);
		order.setCity(city);
		order.setArea(area);
		order.setZipcode(zipcode);
		order.setAddress(address);

		order.setDetail(lSods);
	}

	public static boolean isInteger(String value) {
		if (value.equals("")) {
			return false;
		}
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
