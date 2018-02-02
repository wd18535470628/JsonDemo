package com.scan.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.google.gson.Gson;
import com.scan.bean.LoginUserBean;
import com.scan.util.GetRequestJsonUtils;

/**
 * Servlet implementation class ScanServlet
 */
@WebServlet("/ScanServlet")
public class ScanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScanServlet() {
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
		String requestJsonString = GetRequestJsonUtils.getRequestJsonString(request);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter printWriter = response.getWriter();
		String resp = "{\"message\":" + "登录成功," + "\"statusCode\":" + "200," + "\"success\":" + "true," + "\"data\":" + "{\"id\":" + "2," + "\"userName\":"+ "\"js004\","+"\"realName\":"+ "\"张三\","+"\"token\":"+ "\"d61f4f7139eef90\""+"}" + "}";
		//String resp = "{\"message\":" + "登录失败," + "\"statusCode\":" + "201," + "\"success\":" + "false" + "\"data\":" + "null" + "}";
		printWriter.print(resp);
		System.out.println("resp:"+resp);
		System.out.println("requestJsonString:" + requestJsonString);
		
		JSONObject jsonObject = JSONObject.fromObject(requestJsonString);
		String reqNo = jsonObject.getString("reqNo");
		String versionNo = jsonObject.getString("versionNo");
		JSONObject data=JSONObject.fromObject(jsonObject.get("data")); 
		String password = data.getString("password");
		String userName = data.getString("userName");
		
		System.out.println("reqNo:"+reqNo + ", versionNo:" + versionNo + ", userName:" + userName + ", password:" + password);
		
		
		
	}

}
