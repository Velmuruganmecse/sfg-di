package vel.di.Dependency.Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vel.di.Dependency.Injection.controllers.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		String greeting=myController.sayHello();
		System.out.println(greeting);

	}

}
