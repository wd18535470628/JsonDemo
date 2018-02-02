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
 * Servlet implementation class ScanResultServer
 */
@WebServlet("/ScanResultServer")
public class ScanResultServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScanResultServer() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String ScanResult = GetRequestJsonUtils.getRequestJsonString(request);
		
		//Gson gson = new Gson();
		// 将json 转化成 java 对象
		//User user = gson.fromJson(requestJsonString, User.class);
		PrintWriter printWriter = response.getWriter();
		String resp = "{\"message\":" + "扫码添加成功," + "\"statusCode\":" + "200," + "\"success\":" + "true," + "\"data\":" + "山西省" + "}";
		printWriter.print(resp);
		System.out.println("ScanResult:" + ScanResult);
	}
}
