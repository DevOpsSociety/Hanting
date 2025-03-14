package org.example.hanmo.error;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ErrorCode {
    BAD_REQUEST_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "400 Bad Request"),
    PARAMETER_VALID_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "잘못된 파라미터 값"),
    UNAUTHORIZED_EXCEPTION(HttpStatus.UNAUTHORIZED, "401", "UnAuthorized User"),
    FORBIDDEN_EXCEPTION(HttpStatus.FORBIDDEN, "403", "403 Forbidden"),
    NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "404", "404 Not Found"),
    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "500", "500 Server Error"),
    SMS_SENDER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "500", "500 SMS Sender Error");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
