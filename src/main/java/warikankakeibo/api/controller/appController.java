package warikankakeibo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

    @GetMapping("/")
    public String index() {
        return "app top";
    }

}
