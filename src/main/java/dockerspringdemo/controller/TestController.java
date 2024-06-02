package dockerspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/test")
@RestController
public class TestController {

    private int count = 1;
    @GetMapping("/test1")
    public Mono<String> getMessage(){
        System.out.println("server hit:"+count++);
        return Mono.just("hello");
    }
}
