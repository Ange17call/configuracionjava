package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.interfaces.Operacion;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    Operacion obj = (Operacion) context.getBean("sumaBean");
	    
	    int resultado =obj.suma(4, 6);
	     System.out.println("El resultado es:  "+resultado);
	     
	     ((AnnotationConfigApplicationContext) context).close();
	}

}
