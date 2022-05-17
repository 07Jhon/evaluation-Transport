package evaluation.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    public Environements environements;

    @Autowired
    public Controller() {

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleNoSuchElementFoundException(Exception exception) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).header("Code", HttpStatus.BAD_GATEWAY.toString())
                .header("Code", HttpStatus.BAD_GATEWAY.toString()).body(exception.getMessage());
    }
}