package com.creditSuisse.LogFile;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.creditSuisse.LogFile.service.EventLogService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@SuppressWarnings({"NullableProblems"})
public class LogFileApplication {
	Logger log = null;

	@Autowired
	EventLogService eventLogService;
	
	public static void main(String[] args) {
		SpringApplication mainApp = new SpringApplication(LogFileApplication.class);
		//Overriding run method so that we can call our custom functions
		mainApp.run(args);
	}
	
	
	
	public void run(String... args) {
		
		log.info("Starting to execute...");
		if(args==null || args.length!=1) {
			throw new IllegalArgumentException("Invalid argument passed. File location must be passed to execute the program");
		}
		//Parsing and Storing the server logs
		eventLogService.parseAndStoreEvents(args[0]);
		
		//Printing the logs saved in database
		eventLogService.printAllDatabaseEvents();
		System.exit(0);
		
	}
	

}
