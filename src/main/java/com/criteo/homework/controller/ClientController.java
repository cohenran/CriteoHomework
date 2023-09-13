package com.criteo.homework.controller;

import com.criteo.homework.model.CampaignEntity;
import com.criteo.homework.service.CampaignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/campaign")
public class ClientController {
	@Autowired
	private CampaignService campaignService;

	@RequestMapping(value = "/create_campaign",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(HttpStatus.OK)
	public CampaignEntity createClient(
			@RequestParam(required = true,
					name = "name")
					String name,
			@RequestParam(required = true,
					name = "start_date")
			@DateTimeFormat(pattern = "dd-MM-yyyy")
					LocalDate startDate,
			@RequestParam(required = true,
					name = "productIdentifier")
					List<String> productIdentifiers,
			@RequestParam(required = true,
					name = "bid")
					Float bid
	) {
		return campaignService.createCampaign(name, startDate, productIdentifiers, bid);
	}
}
