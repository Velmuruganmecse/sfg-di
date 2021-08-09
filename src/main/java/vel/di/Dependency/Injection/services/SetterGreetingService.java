package vel.di.Dependency.Injection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Qualifier("setterInjectedGreetingService")
    @Override
    public String sayGreeting()
    {
        return "Hello World-Property";
    }
}
