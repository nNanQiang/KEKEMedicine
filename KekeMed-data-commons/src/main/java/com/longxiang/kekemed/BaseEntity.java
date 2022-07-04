package com.longxiang.kekemed;

import lombok.Data;

import java.io.Serializable;

/**
 * <b>基础实体</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@Data
public class BaseEntity implements Serializable {
	private Data createTime;					//创建时间
	private Data updateTime;					//修改时间
	private String creater;						//创建人
	private String updater;						//修改人
}
