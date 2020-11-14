package info.thecodinglive.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String defaultMessage() {
        return "ok";
    }
}
