package evaluation.transports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TransportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportsApplication.class, args);
	}
	@GetMapping
	public String get() {
		return "redirect:/chauffeur";
	}
}
