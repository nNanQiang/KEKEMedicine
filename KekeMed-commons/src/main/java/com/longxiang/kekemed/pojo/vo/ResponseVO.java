package com.longxiang.kekemed.pojo.vo;

import com.longxiang.kekemed.pojo.enums.ResponseEnum;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * <b>响应视图</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = 5527516909579556149L;

	private Integer code;
	private String message;
	private E data;

	public ResponseVO (ResponseEnum responseEnum, String message, E data) {
		this.code = responseEnum.getCode();
		this.data = data;
	}

	/**
	 * <b>返回默认系统响应成功方法</b>
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS,
				ResponseEnum.RESPONSE_SUCCESS.getRemark(), "");
	}
	/**
	 * <b>返回携带信息系统响应成功方法</b>
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(String message) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, "");
	}
	/**
	 * <b>返回携带信息及数据系统响应成功方法</b>
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(String message, Data data) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, data);
	}
	/**
	 * <b>返回未认证视图方法</b>
	 * @return
	 */
	public static ResponseVO getUnAuthResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_UNAUTH,
				ResponseEnum.RESPONSE_UNAUTH.getRemark(), "");
	}
	/**
	 * <b>返回携带失败信息视图方法</b>
	 * @return
	 */
	public static ResponseVO getFailuarResponseVO(String message) {
		return new ResponseVO(ResponseEnum.RESPONSE_FAILURE, message, "");
	}
	/**
	 * <b>返回异常视图方法</b>
	 * @return
	 */
	public static ResponseVO getExceptionResponseVO(Exception e) {
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION,
				ResponseEnum.RESPONSE_EXCEPTION.getRemark(), e);
	}
}
