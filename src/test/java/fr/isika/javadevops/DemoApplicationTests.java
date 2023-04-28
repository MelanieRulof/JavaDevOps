package fr.isika.javadevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.isika.javadevops.model.Person;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void createNewPerson() {
		Person person = new Person();
		person.setName("Bob");
		Assertions.assertEquals("Bobo", person.getName());
	}

}
