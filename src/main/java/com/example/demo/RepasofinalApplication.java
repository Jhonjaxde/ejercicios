package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IBodegaService;

@SpringBootApplication
public class RepasofinalApplication implements CommandLineRunner{
@Autowired
private IBodegaService bodegaService;
	public static void main(String[] args) {
		SpringApplication.run(RepasofinalApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.bodegaService.buscarLista());
		
	}

}
