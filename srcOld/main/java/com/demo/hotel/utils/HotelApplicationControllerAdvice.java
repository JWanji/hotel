package com.demo.hotel.utils;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HotelApplicationControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception exception) {
		ErrorInfo error = new ErrorInfo();
		error.setErrorMessage("Some Exception occured. " + exception.getMessage());
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setTimeStamp(LocalDate.now());
		exception.printStackTrace();
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
