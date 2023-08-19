package comteksen.testapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/hello")
public class HelloWorldController {

    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/{firstname}/{lastname}")
    public ResponseEntity<String> helloWorld(@PathVariable String firstname, @PathVariable String lastname){
        if(logger.isDebugEnabled())
            logger.debug(String.format("Helloo From Docker %s %s", firstname, lastname));
        return ResponseEntity.ok("Hello " + firstname + " " + lastname);
    }
}
