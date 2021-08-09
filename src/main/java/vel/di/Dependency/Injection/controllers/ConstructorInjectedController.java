package vel.di.Dependency.Injection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vel.di.Dependency.Injection.services.GreetingService;
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
// @Autowired - Its optional for constructor injected controller
    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
