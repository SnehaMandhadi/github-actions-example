package com.java.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitthubCicdActionsApplication {
	
	@GetMapping
	public String welcome() {
	return " Welcome to javatechie";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitthubCicdActionsApplication.class, args);
	}
//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/SnehaMandhadi/github-actions-example.git
//	git push -u origin main

}
