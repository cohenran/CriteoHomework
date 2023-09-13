package com.criteo.homework.controller;


import com.criteo.homework.Application;
import com.criteo.homework.model.CampaignEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ClientControllerTest {
	@Autowired
	private ClientController clientController;
	
	@Test
	public void createCampaignTest() {
		String name = "Test Name";
		LocalDate date = LocalDate.now();
		List<String> productIdentifiers = Arrays.asList("TV", "Computer", "Android");
		Float bid = 1234.567f;
		
		CampaignEntity campaignEntity = clientController.createClient(name, date, productIdentifiers, bid);
		
		assertTrue(campaignEntity != null && campaignEntity.getId() != null);
	}
}
