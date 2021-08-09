package vel.di.Dependency.Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vel.di.Dependency.Injection.controllers.ConstructorInjectedController;
import vel.di.Dependency.Injection.controllers.MyController;
import vel.di.Dependency.Injection.controllers.PropertyInjectedController;
import vel.di.Dependency.Injection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		System.out.println("-----Primary Bean");
		System.out.println(myController.sayHello());


		System.out.println("------------Property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------Setter");
		SetterInjectedController setterInjectedController =(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------Constructor");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		//test
	}

}
