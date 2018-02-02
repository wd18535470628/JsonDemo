# JsonDemo
前台发送的数据，后台利用HttpServlet中的doPost方法request获取到数据，然后解析json嵌套的数据转换为javaBean对象

#　以下为解析的一个最基本例子,当然可以用Gson库,也可以用com.alibaba.fastjson这个库,方法很多。

json格式字符串:requestJsonString:{"data":{"password":"94edf28c6d6da38fd35d7ad53e485307f89fbeaf120485c8d17a43f323deee71","userName":"js01"},"reqNo":"101","versionNo":"1.0.0"}

JSONObject jsonObject = JSONObject.fromObject(requestJsonString);
String reqNo = jsonObject.getString("reqNo");
String versionNo = jsonObject.getString("versionNo");
JSONObject data=JSONObject.fromObject(jsonObject.get("data")); 
String password = data.getString("password");
String userName = data.getString("userName");

System.out.println("reqNo:"+reqNo + ", versionNo:" + versionNo + ", userName:" + userName + ", password:" + password);

控制台输出:reqNo:101, versionNo:1.0.0, userName:js01, password:94edf28c6d6da38fd35d7ad53e485307f89fbeaf120485c8d17a43f323deee71