package ua.kiev.greegav.sprintstudy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructor {
    private HelloWorldService helloWorldService;

    //    @Autowired
    //    Worked without??
    public InjectedByConstructor(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }
}
