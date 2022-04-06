package dev.gabrielQ7.streamsschedule.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LiveStreamNotFoundException extends RuntimeException{
    public LiveStreamNotFoundException() {
        System.out.println("Live Stream Not Found Exception");
    }

    public LiveStreamNotFoundException(String message) {
        super(message);
        System.out.println("Live Stream Not Found Exception");
    }

    public LiveStreamNotFoundException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("Live Stream Not Found Exception");
    }

    public LiveStreamNotFoundException(Throwable cause) {
        super(cause);
        System.out.println("Live Stream Not Found Exception");
    }
}
