package com.longxiang.kekemed.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@Data
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -766897973536349355L;

	private Date createTime;
	private Date uptateTime;
	private String creater;
	private String updater;
}
