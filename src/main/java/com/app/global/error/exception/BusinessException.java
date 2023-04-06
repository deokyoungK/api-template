package com.app.global.error.exception;

import com.app.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        System.out.println("==================");
        System.out.println("HttpStatus : " +errorCode.getHttpStatus());
        System.out.println("==================");
        System.out.println("errorCode : " +errorCode.getErrorCode());
        System.out.println("==================");
        System.out.println("Message : " +errorCode.getMessage());
        System.out.println("==================");
        this.errorCode = errorCode;
    }
}
