package com.prolto.demo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prolto.demo.utils.HttpRequest;
import com.prolto.demo.utils.MD5;

/**
 * Servlet implementation class GetInfoByTid
 */
@WebServlet("/GetInfoByTidServlet")
public class GetInfoByTidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInfoByTidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tid = request.getParameter("tid");
		String shop_code = request.getParameter("shop_code");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(new Date());
		String test = "14643193030389app_key1464319303"
				+ "methodoms.OrderQueryInfoByTidshop_code"+shop_code+"tid"+ tid
				+ "timestamp"+ time +"14643193030389";
		String md5Str = MD5.getMD5(test.getBytes()).toUpperCase();
		String url = "http://120.24.59.88/oms/webservice.php";
		String param = "app_key=1464319303&method=oms.OrderQueryInfoByTid&shop_code="+ shop_code
				+ "&tid=" + tid+ "&timestamp=" + time + "&app_sign=" + md5Str;
		String responseStr = HttpRequest.sendGet(url, param);
		String urlStr = url + "?" + param;
		String jsonStr = "{\"urlStr\":\""+ urlStr +"\",\"responseStr\":\"" + responseStr +"\"}";
		response.getOutputStream().write(jsonStr.getBytes("UTF-8"));  
		response.setContentType("text/json; charset=UTF-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
