package pers.hong.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HystrixRemote implements FeignRemote {
    @Override
    public String clientMessage(@RequestParam("name") String name) {
        return name + " this message sending failed";
    }
}
