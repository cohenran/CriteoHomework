package com.criteo.homework.service;

import com.criteo.homework.dal.CampaignRepository;
import com.criteo.homework.dal.ProductRepository;
import com.criteo.homework.model.CampaignEntity;
import com.criteo.homework.model.ProductEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class CampaignService {
	@Resource
	private ProductRepository productRepository;
	@Resource
	private CampaignRepository campaignRepository;
	
	public CampaignEntity createCampaign(String name, LocalDate startDate, List<String> productSerialNumber, Float bid) {
		List<ProductEntity> productEntities = productRepository.findByProductSerialNumberIn(productSerialNumber);
		CampaignEntity campaignEntity = new CampaignEntity(startDate, bid, name, productEntities);
				
		return campaignRepository.save(campaignEntity);		
	}
}
