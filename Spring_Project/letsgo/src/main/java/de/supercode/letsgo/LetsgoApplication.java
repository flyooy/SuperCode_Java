// Spring Initializr ist ein Web-Tool zur Erstellung von Initialprojekten für Spring Boot, das es ermöglicht, das Build-Tool (Maven oder Gradle), die Version von Spring Boot und die benötigten Abhängigkeiten auszuwählen.

// Build-Tool (z. B. Maven oder Gradle) ist ein Werkzeug, das den Prozess des Buildens, des Abhängigkeitsmanagements und der Bereitstellung eines Projekts automatisiert. Einfach ausgedrückt sammelt es den Quellcode, lädt die benötigten Bibliotheken herunter und erstellt die fertige Anwendung.

package de.supercode.letsgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LetsgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsgoApplication.class, args);
	}

}
