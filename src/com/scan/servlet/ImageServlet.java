package com.scan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scan.util.GetRequestJsonUtils;

/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//Gson gson = new Gson();
		// 将json 转化成 java 对象
		//User user = gson.fromJson(requestJsonString, User.class);
		String ScanResult = GetRequestJsonUtils.getRequestJsonString(request);
		PrintWriter printWriter = response.getWriter();
		String resp = "200";
		//String resp = "{\"message\":" + "登录失败," + "\"statusCode\":" + "201," + "\"success\":" + "false" + "\"data\":" + "null" + "}";
		printWriter.print(resp);
		System.out.println("ScanResult:" + ScanResult);

	}

}
