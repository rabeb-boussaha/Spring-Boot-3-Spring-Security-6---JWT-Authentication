package Ticketsd.Incident.Ticketsd.Incident.exception;

import org.springframework.http.HttpStatus;

import java.net.http.HttpClient;
import java.time.ZonedDateTime;

public class ApiExecption {
    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    private final String message;
    private final Throwable throwable;

    public ApiExecption(String message,
                        Throwable throwable,
                        HttpStatus httpStatus,
                        ZonedDateTime timestamp) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;
}
