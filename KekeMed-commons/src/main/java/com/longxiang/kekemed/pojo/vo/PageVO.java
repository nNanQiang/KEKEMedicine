package com.longxiang.kekemed.pojo.vo;

import com.longxiang.kekemed.util.BaseConstants;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = 2588455466610327172L;

	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Long totalCount;
	private Integer totalPage;

	public PageVO () {}

	public PageVO (Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.BASE_NUM;
		}
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.BASE_SIZE;
		}
	}
}
