package com.criteo.homework.controller;

import com.criteo.homework.model.CampaignEntity;
import com.criteo.homework.service.AdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/ad")
public class AdController {
	@Autowired
	private AdService adService;

	@RequestMapping(value = "/serve_ad",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(HttpStatus.OK)
	public CampaignEntity serveAd(
			@RequestParam(required = true,
					name = "category_name")
					String categoryName
	) {
		return adService.serveAd(categoryName);
	}
}
