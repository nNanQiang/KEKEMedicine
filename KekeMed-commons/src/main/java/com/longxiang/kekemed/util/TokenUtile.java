package com.longxiang.kekemed.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b> token 工具类</b>
 *
 * @author ssss
 * @date 2022/7/6
 */
public class TokenUtile {
	private static final String PAYLOAD_KEY = "payload";

	public static String createToken(Object value, Integer expireSec) {
		Map<String, Object> payloadMap = new HashMap<String, Object>();
		payloadMap.put(PAYLOAD_KEY, value);
		Long expireMillis = System.currentTimeMillis() + expireSec * 1000;
		Date expireDate = new Date(expireMillis);
		payloadMap.put(JWT.EXPIRES_AT,expireDate);
		return JWTUtil.createToken(payloadMap,BaseConstants.TOKEN_KEY.getBytes());
	}

	public static Object validateToken(String token) {
		if (StrUtil.isNotBlank(token) && JWTUtil.verify(token,BaseConstants.TOKEN_KEY.getBytes())) {
			return JWTUtil.parseToken(token).getPayload(PAYLOAD_KEY);
		}
		return null;
	}
}
