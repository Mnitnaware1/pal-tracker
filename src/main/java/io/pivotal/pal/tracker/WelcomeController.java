package io.pivotal.pal.tracker;

/**
 * Created by MI20085585 on 6/24/2019.
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    private final String message;
    public WelcomeController(@Value("${welcome.message}")String message) {
       this.message=message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}
