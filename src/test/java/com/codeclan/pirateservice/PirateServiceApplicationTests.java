package com.codeclan.pirateservice;

import com.codeclan.pirateservice.models.Pirate;
import com.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate() {
		Pirate jack = new Pirate("Jack", "Sparrow", 54);
		pirateRepository.save(jack);

	}

}
