package com.example.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@SpringBootApplication
@RestController
@Transactional
public class MavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
		System.out.println("JAR");
	}

	@GetMapping("/")
	public String home()
	{
		return  "HOME of Spring";
	}

	@GetMapping("/docker")
	public String docker(){
		return "Docker is running";
	}

	@PostMapping(value = "/display")
	public String post(@RequestParam String name){
			return name;
	}

}
