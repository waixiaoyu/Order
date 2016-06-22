package com.prolto.demo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.prolto.demo.utils.HttpRequest;
import com.prolto.demo.utils.MD5;

/**
 * Servlet implementation class GetInfoByTid
 */
@WebServlet(name = "GetInfoByTidServlet", urlPatterns = "/getInfoByTid")
public class GetInfoByTidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String TEST_SHOP_CODE="CS02";
	private static final String TEST_TID="14100002220131";
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
		System.out.println("GetInfoByTidServlet");
		String tid = request.getParameter("tid");
		String shop_code = request.getParameter("shop_code");
		System.out.println(tid+shop_code);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(new Date());
		String test = "14643193030389app_key1464319303"
				+ "methodoms.OrderQueryInfoByTidshop_code"+shop_code+"tid"+ tid
				+ "timestamp"+ time +"14643193030389";
		String md5Str = MD5.getMD5(test.getBytes()).toUpperCase();
		String url = "http://120.24.59.88/oms/webservice.php";
		String param = "app_key=1464319303&method=oms.OrderQueryInfoByTid&shop_code="+ shop_code
				+ "&tid=" + tid+ "&timestamp=" + time + "&app_sign=" + md5Str;
		System.out.println(param);
		
		
		String responseStr = HttpRequest.sendGet(url, param);
		String urlStr = url + "?" + param;
		
		request.setAttribute("urlStr", urlStr);
		request.setAttribute("responseStr", responseStr);

		ServletContext sc = getServletContext();
		sc.getRequestDispatcher("/getInfoByTid.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
