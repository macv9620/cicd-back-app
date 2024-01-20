package com.vertech.forest;

import com.vertech.forest.persistence.entity.SpecieInfoEntity;
import com.vertech.forest.service.SpecieInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ForestApplicationTests {

	@Autowired
	private SpecieInfoService specieInfoService;

	@Test
	void countSpecies() {
		List<SpecieInfoEntity> species;

		species = specieInfoService.getAllSpecies();
		int speciesQuantity = species.size();

		Assertions.assertEquals(10, speciesQuantity);
	}

}
