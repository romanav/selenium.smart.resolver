package resolver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
