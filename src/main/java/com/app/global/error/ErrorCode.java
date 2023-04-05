package com.app.global.error;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR,"001","business exception test");
    ;
    ErrorCode(HttpStatus httpstatus,String errorCode, String message){
        this.httpStatus = httpstatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    private String errorCode;
    private HttpStatus httpStatus;
    private String message;

}
