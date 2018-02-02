package com.scan.util;

import java.io.Serializable;

/**
 * Result : ��Ӧ�Ľ������
 *
 * @author StarZou
 * @since 2014-09-27 16:28
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 6288374846131788743L;

    /**
     * ��Ϣ
     */
    private String message;

    /**
     * ״̬��
     */
    private int statusCode;

    /**
     * �Ƿ�ɹ�
     */
    private boolean success;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Result() {

    }
}
