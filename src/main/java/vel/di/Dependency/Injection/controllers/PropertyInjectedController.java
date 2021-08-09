package vel.di.Dependency.Injection.controllers;

import vel.di.Dependency.Injection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
