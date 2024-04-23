package Ticketsd.Incident.Ticketsd.Incident.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiExecptionHandler {
@ExceptionHandler(value = {ApiRequestExecption.class})
    public ResponseEntity<Object> handelApiRequestException (ApiRequestExecption e) {
        //1 . create  payload containing execption details
        HttpStatus badRequest =HttpStatus.BAD_REQUEST;
        ApiExecption apiExecption = new ApiExecption(
                e.getMessage(),
                e,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        // 2 . Return response entity
           return  new ResponseEntity<>(apiExecption , badRequest);
    }
}
