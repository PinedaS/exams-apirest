package pineda.sebastian.examsapirest.web.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class SizeOfSomeOptionIsDifferentThan4Exception extends ResponseStatusException {
    public SizeOfSomeOptionIsDifferentThan4Exception(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
