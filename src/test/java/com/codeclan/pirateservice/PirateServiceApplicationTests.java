package com.codeclan.pirateservice;

import com.codeclan.pirateservice.models.Pirate;
import com.codeclan.pirateservice.models.Ship;
import com.codeclan.pirateservice.repositories.PirateRepository;
import com.codeclan.pirateservice.repositories.ShipRepository;
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
	//dependency injection
	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate() {
		Ship ship = new Ship("The Flying Ductchman");
		shipRepository.save(ship);
		Pirate jack = new Pirate("Jack", "Sparrow", 54,ship);
		pirateRepository.save(jack);

	}

}
