package vel.di.Dependency.Injection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting()
    {
        return "Hello World-Setter";
    }
}
