package pers.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientLoadBalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientLoadBalanceApplication.class, args);
    }
}
