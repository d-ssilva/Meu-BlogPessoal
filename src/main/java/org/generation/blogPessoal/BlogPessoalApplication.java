package org.generation.blogPessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class BlogPessoalApplication {

		/*@GetMapping
		public ModelAndView swaggerUI(){
			return new ModelAndView("redirect:swagger-ui/");
		} */

	public static void main(String[] args) {
		SpringApplication.run(BlogPessoalApplication.class, args);
	}

}
