package pers.hong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.hong.remote.FeignRemote;

@RestController
public class ConsumerController {
    @Autowired
    FeignRemote feignRemote;

    @RequestMapping("/message/{name}")
    public String consumerMessage(@PathVariable("name") String name) {
        return feignRemote.clientMessage(name);
    }
}
