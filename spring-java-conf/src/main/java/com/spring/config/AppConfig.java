package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.spring.implementacion.OperacionImpl;
import com.spring.interfaces.Operacion;

@Configuration
public class AppConfig {
	@Bean(name="sumaBean")
	public Operacion operacion(){
		return new OperacionImpl();
	}
}