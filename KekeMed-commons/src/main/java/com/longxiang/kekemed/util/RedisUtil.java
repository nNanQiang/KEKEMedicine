package com.longxiang.kekemed.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>redis 工具类</b>
 *
 * @author ssss
 * @date 2022/7/4
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>向 redis 中存入数据 </b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @return
	 * @throws Exception
	 */
	public boolean saveToRedis (String key, Object value, Integer expireSec)
			throws Exception {
		JsonMapper jsonMapper = new JsonMapper();
		String valueJSON = jsonMapper.writeValueAsString(value);
		redisTemplate.opsForValue().set(key, valueJSON);
		if (expireSec != null && expireSec > 0) {
			redisTemplate.expire(key,expireSec, TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>从 redis 中获得数据</b>
	 * @param key
	 * @param valueType
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis (String key, Class valueType) throws Exception {
		String valueJSON = redisTemplate.opsForValue().get(key);
		if (valueJSON != null && valueJSON.trim().length() > 0) {
			JsonMapper jsonMapper = new JsonMapper();
			return jsonMapper.readValue(valueJSON,valueType);
		}
		return null;
	}

	/**
	 * <b>从 redis 中删除数据</b>
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public boolean removeRedis (String key) throws Exception {
		if (redisTemplate.delete(key)) {
			return true;
		}
		return false;
	}
}
