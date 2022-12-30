package com.cdac;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.flight;
import com.cdac.repository.FlightRepository;

@SpringBootTest
class FlightRepositoryTest {

	@Autowired
	private FlightRepository flightRepository;
	
	@Test
	void addFlight() {
		flight f = new flight();
		f.setFlightNo("SG-2124");
		f.setFlightDate(LocalDate.of(2023, 1, 1));
		f.setSource("Mumbai");
		f.setDestination("Delhi");
		f.setDepartureTime(LocalTime.of(8,30));
		f.setArrivalTime(LocalTime.of(10, 30));
		f.setPrice(6000);
		
		flightRepository.save(f);
		
		//asserts missing right now
	}

}



