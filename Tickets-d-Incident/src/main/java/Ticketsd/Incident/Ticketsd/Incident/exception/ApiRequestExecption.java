package Ticketsd.Incident.Ticketsd.Incident.exception;

public class ApiRequestExecption  extends  RuntimeException{
    public ApiRequestExecption(String message) {
        super(message);
    }

    public ApiRequestExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
