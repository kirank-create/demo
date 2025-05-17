package com.example.demo;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;

public class Demo {
	
	public static Logger logger=LoggerFactory.getLogger(Demo.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started....");
	}
	public static void main(String[] args) {
		
		logger.info("Application exceuted....");

	
}
}
