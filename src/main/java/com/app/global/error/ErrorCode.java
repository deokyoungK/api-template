package com.app.global.error;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"001","business exception test"),
    TEST_ERROR2(HttpStatus.BAD_GATEWAY, "002", "계정을 찾을 수 없는 경우"),

    // 인증
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED,"A-001","토큰이 만료되었습니다."),
    NOT_VALID_TOKEN(HttpStatus.UNAUTHORIZED,"A-002","해당 토큰은 유효한 토큰이 아닙니다."),
    NOT_EXISTS_AUTHORIZATION(HttpStatus.UNAUTHORIZED,"A-003","Authorization Header가 빈 값입니다."),
    NOT_VALID_BEARER_GRANT_TYPE(HttpStatus.UNAUTHORIZED,"A-004","인증 타입이 Bearer 타입이 아닙니다."),

    //회원
    INVALID_MEMBER_TYPE(HttpStatus.BAD_REQUEST, "M-001","잘못된 회원 타입입니다.(memberType : KAKAO)"),


    ;
    ErrorCode(HttpStatus httpstatus,String errorCode, String message){
        this.httpStatus = httpstatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    private HttpStatus httpStatus; //"500 INTERNAL_SERVER_ERROR"
    private String errorCode; //"011"
    private String message; // "~~에러입니다"

}
