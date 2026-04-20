package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();//Gerando ID automaticamente
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "word") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
