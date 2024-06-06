package in.swadhin.configuraton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.swadhin.bean.student;

@Configuration
public class java_config {
	@Bean
	public student servletdemo()
	{
		student std=new student();
		std.setName("dillip");
		std.setRollno("102");
		std.setEmail("dillip@gmail.com");
		return std;
	}

}
