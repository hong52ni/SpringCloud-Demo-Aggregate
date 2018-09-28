package pers.hong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @RequestMapping("/message")
    public String clientMessage(@RequestParam("name") String name) {
        return name + " i am load balance service";
    }
}
