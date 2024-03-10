package otus.homework.hw2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
public class AppConroller {

    @GetMapping("/")
    public ResponseEntity<String> getResponse() {
        return new ResponseEntity<>("{\"status\": \"OK\"}", HttpStatus.OK);

    }

}
