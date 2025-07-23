package com.ourystd.springlearningstarter;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootApplication
@Log
public class SpringLearningStarterApplication implements CommandLineRunner {
	private final DataSource dataSource;

	public SpringLearningStarterApplication(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningStarterApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info("DataSource: " + dataSource.toString());
//		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);

	}
}
