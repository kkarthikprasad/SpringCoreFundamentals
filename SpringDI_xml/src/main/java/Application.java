import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daimler.spring.service.CustomerService;
import com.daimler.spring.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationTest.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName() );
	}
}
