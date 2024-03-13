package com.example.jotserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JotServerApplication {

	private static final Logger log = LoggerFactory.getLogger(JotServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JotServerApplication.class, args);
	}

	public CommandLineRunner demo(NoteRepository repository) {
		return (args) -> {
			// fetch an individual note by ID
			Note note = repository.findNote(1L);
			log.info("Note found with findById(1L):");
			log.info("--------------------------------");
			log.info(note.toString());
			log.info("");
		};
	}
}


