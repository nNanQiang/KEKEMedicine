package com.longxiang.kekemed.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b>基础配置信息加载类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
public class BaseConstants {
	private static Properties props = new Properties();
	private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);

	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("prop.base/base.properties"));
		} catch (IOException e) {
			logger.error(e.getMessage() + ":" + new Date(), e);
			throw new RuntimeException(e);
		}
	}


	public static final Integer BASE_NUM = Integer.parseInt(props.getProperty("base.page.num"));
	public static final Integer BASE_SIZE = Integer.parseInt(props.getProperty("base.page.size"));
	public static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("base.response.success"));
	public static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("base.response.unauth"));
	public static final Integer RESPONSE_FAILURE = Integer.parseInt(props.getProperty("base.response.failure"));
	public static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("base.response.exception"));

	public static final String STATUS_ENABLE = props.getProperty("base.status.enable");

	public static final String STATUS_DISABLE = props.getProperty("base.status.disable");

	public static final String TOKEN_KEY = props.getProperty("base.token.key");
	public static final Integer TOKEN_EXPIRE = Integer.parseInt(props.getProperty("base.token.expire"));

}
