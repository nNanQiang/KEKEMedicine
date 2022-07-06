package com.longxiang.kekemed.exception;

import com.longxiang.kekemed.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * <b>异常抛出</b>
 *
 * @author ssss
 * @date 2022/7/6
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler
	public ResponseVO globalExceptionHandle(Exception e) {
		logger.error(e.getMessage() + ":" + new Date(), e);
		return ResponseVO.getExceptionResponseVO(e);
	}
}
