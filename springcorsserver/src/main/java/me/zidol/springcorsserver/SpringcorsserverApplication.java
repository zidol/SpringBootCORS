package me.zidol.springcorsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@CrossOrigin(origins = "http://localhost:18080")
@RestController
public class SpringcorsserverApplication {

//    @CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("/hello")
    public  String hello() {
        return "hello cors";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringcorsserverApplication.class, args);
    }

}
