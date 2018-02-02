package com.scan.bean;

public class LoginUserBean {
	
	private String reqNo;
	private String versionNo;
	
	private DateBean data;
	
	class DateBean{
		
		private String userName;
		private String password;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}

	public LoginUserBean(String reqNo, String versionNo, DateBean data) {
		super();
		this.reqNo = reqNo;
		this.versionNo = versionNo;
		this.data = data;
	}

	public String getReqNo() {
		return reqNo;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public DateBean getData() {
		return data;
	}

	public void setData(DateBean data) {
		this.data = data;
	}
	
	

}
