package com.codeclan.pirateservice;

import com.codeclan.pirateservice.models.Pirate;
import com.codeclan.pirateservice.models.Raid;
import com.codeclan.pirateservice.models.Ship;
import com.codeclan.pirateservice.repositories.PirateRepository;
import com.codeclan.pirateservice.repositories.RaidRepository;
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
	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate() {
		Ship ship = new Ship("The Flying Ductchman");
		shipRepository.save(ship);
		Pirate pirate1 = new Pirate("Jack", "Sparrow", 54, ship);
		pirateRepository.save(pirate1);
		Pirate pirate2 = new Pirate("Sree", "Birdseye", 74, ship);
		pirateRepository.save(pirate2);

		Raid raid1 = new Raid("Saltcoats");
		Raid raid2 = new Raid("Govan Asda");
		raid1.addPirate(pirate1);
		raid1.addPirate(pirate2);

		pirate1.addRaid(raid1);
		pirate2.addRaid(raid1);
//		pirateRepository.save(pirate2);
		raidRepository.save(raid1);
//		pirateRepository.save(pirate1);


	}

}//