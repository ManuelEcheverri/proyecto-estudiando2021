package co.com.edu.apiestudiante2021.consulta.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {

	@GetMapping
	public String showStatus() {
		return "It works!";
	}
}
