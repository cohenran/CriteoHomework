package com.criteo.homework.service;

import com.criteo.homework.dal.CampaignRepository;
import com.criteo.homework.model.CampaignEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdService {
	@Resource
	private CampaignRepository campaignRepository;

	public CampaignEntity serveAd(String categoryName) {
		CampaignEntity selectedCampaign = campaignRepository.getHighestBidProductFromActiveCategory(categoryName);

		if (selectedCampaign == null) {
			selectedCampaign = campaignRepository.getHighestBidProduct();
		}

		return selectedCampaign;
	}
}
