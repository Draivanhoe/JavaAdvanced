// Scrivi un'applicazione web Spring Boot che alla endpoint
// GET v2/ciao/Lombardia?nome=Giuseppe
// risponde con un oggetto JSON così formato:
// {
//    "nome": "Giuseppe",
//    "provincia": "Lombardia",
//    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
// }

package com.example.demowebappivan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebappIvanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoWebappIvanApplication.class, args);
	}
}
