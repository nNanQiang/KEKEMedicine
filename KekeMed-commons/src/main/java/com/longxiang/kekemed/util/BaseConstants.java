package com.longxiang.kekemed.util;

import java.io.IOException;
import java.util.Properties;

/**
 * <b>基础配置信息加载类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
public class BaseConstants {
	private static Properties props = new Properties();

	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("prop.base/base.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	public static final Integer BASE_NUM = Integer.parseInt(props.getProperty("base.page.num"));
	public static final Integer BASE_SIZE = Integer.parseInt(props.getProperty("base.page.size"));
	public static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("base.response.success"));
	public static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("base.response.unauth"));
	public static final Integer RESPONSE_FAILURE = Integer.parseInt(props.getProperty("base.response.failure"));
	public static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("base.response.exception"));
}
