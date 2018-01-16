import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.daimler.spring.repository.CustomerRepository;
import com.daimler.spring.repository.HibernateCustomerRepositoryImpl;
import com.daimler.spring.service.CustomerService;
import com.daimler.spring.service.CustomerServiceImpl;

@Configuration
@ComponentScan("com.daimler.spring")
@PropertySource("app.properties")
public class ApplicationConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
////		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl service = new CustomerServiceImpl();
////		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
	
	

	// without declaring this bean we can use autorwiring by mentioning the Stereotype Annotation in CustomerRepository class
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
