package ua.kiev.greegav.sprintstudy.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {
    public void sayHello() {
        System.out.println("Hi!");
    }
}
