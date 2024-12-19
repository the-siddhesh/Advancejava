package Advance.java.lecture3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture3Application {

	public static void main(String[] args) {
		ApplicationContext cont = SpringApplication.run(Lecture3Application.class, args);
//        Demo d = cont.getBean(Demo.class);
//		
//		System.out.println(d);
	}

}
