package com.M0001; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
@EntityScan(basePackages = "com.Entities") 
@SpringBootApplication public class M0001SqlServerApplication { 
	public static void main(String[] args) { 
	SpringApplication.run(M0001SqlServerApplication.class, args); 
	} 
}