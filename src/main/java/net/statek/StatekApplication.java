package net.statek;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.builder.SpringApplicationBuilder;
		import org.springframework.boot.web.support.SpringBootServletInitializer;
		import org.springframework.context.annotation.ComponentScan;
		import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class StatekApplication  {

	public static void main(String[] args) {
		SpringApplication.run(StatekApplication.class, args);
	}

}
