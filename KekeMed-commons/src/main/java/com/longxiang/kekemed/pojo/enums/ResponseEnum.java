package com.longxiang.kekemed.pojo.enums;

import com.longxiang.kekemed.util.BaseConstants;

/**
 * <b>响应视图 code 枚举</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
public enum ResponseEnum {
	RESPONSE_SUCCESS(BaseConstants.RESPONSE_SUCCESS, "系统响应成功"),
	RESPONSE_UNAUTH(BaseConstants.RESPONSE_UNAUTH, "用户未认证"),
	RESPONSE_FAILURE(BaseConstants.RESPONSE_FAILURE, "系统响应失败"),
	RESPONSE_EXCEPTION(BaseConstants.RESPONSE_EXCEPTION, "系统响应异常"),
	;
	private Integer code;
	private String remark;

	private ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
