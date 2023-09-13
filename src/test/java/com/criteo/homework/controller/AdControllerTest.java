package com.criteo.homework.controller;


import com.criteo.homework.Application;
import com.criteo.homework.model.CampaignEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
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
public class AdControllerTest {
	@Autowired
	private ClientController clientController;
	@Autowired
	private AdController adController;
	
	@Before
	public void init() {
		List<String> productIdentifiers = Arrays.asList("TV", "Computer", "Android");
		
		clientController.createClient("1", LocalDate.now(), productIdentifiers, 5f);
		clientController.createClient("1", LocalDate.now(), productIdentifiers, 6f);
		clientController.createClient("1", LocalDate.now(), productIdentifiers, 7f);
		clientController.createClient("1", LocalDate.now(), productIdentifiers, 8f);
	}
	
	@Test
	public void serveAdTest() {
		adController.serveAd("1");
	}
}
