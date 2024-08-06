package vn.edu.iuh.fit.authenticate.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import vn.edu.iuh.fit.authenticate.dto.responses.ApiResponse;
import vn.edu.iuh.fit.authenticate.enums.ErrorCode;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  ResponseEntity<ApiResponse> handlingRuntimeException(RuntimeException exception) {
    log.error("Exception: ", exception);
    return ResponseEntity.badRequest().body(
        ApiResponse.builder().code(ErrorCode.UNCATEGORIZED_EXCEPTION.getCode())
            .message(ErrorCode.UNCATEGORIZED_EXCEPTION.getMessage()).build());

  }

}
