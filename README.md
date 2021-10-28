## Hello World com Spring Boot
> Setup Inicial em - https://spring.io/guides/gs/spring-boot/

# EndPoint 1

##### Criar a classe principal, assim:

<blockquote>
	
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	
	@SpringBootApplication
	public class SpringHellov2Application {
		public static void main(String[] args) {
			SpringApplication.run(SpringHellov2Application.class, args);
		}
	}
</blockquote>

# EndPoint 2

##### Criar a classe controller, assim:

<blockquote>

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class ControllerMain {
	
		@GetMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}
	
	}
</blockquote>

## Executando 

![teste](https://cdn.discordapp.com/attachments/903344027364118528/903345358606843915/run-short.mov)

