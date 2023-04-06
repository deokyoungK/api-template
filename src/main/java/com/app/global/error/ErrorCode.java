package com.app.global.error;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"001","business exception test"),
    TEST_ERROR2(HttpStatus.BAD_GATEWAY, "002", "계정을 찾을 수 없는 경우");

    ErrorCode(HttpStatus httpstatus,String errorCode, String message){
        this.httpStatus = httpstatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    private HttpStatus httpStatus; //"500 INTERNAL_SERVER_ERROR"
    private String errorCode; //"011"
    private String message; // "~~에러입니다"

}
