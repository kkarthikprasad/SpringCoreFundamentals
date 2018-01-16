import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.daimler.spring.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		CustomerService service = context.getBean("customerService", CustomerService.class);

		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());

		CustomerService service2 = context.getBean("customerService", CustomerService.class);

		System.out.println(service2);
		
	}
}
