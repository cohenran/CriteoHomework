package com.criteo.homework.dal;

import com.criteo.homework.model.CampaignEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends CrudRepository<CampaignEntity, Integer> {
	@Query(value = "SELECT * FROM criteo.campaign " +
			"WHERE name = :name and " +
			"start_date > CURRENT_DATE() - 10 " +
			"ORDER BY bid " +
			"LIMIT 1",
			nativeQuery = true)
	CampaignEntity getHighestBidProductFromActiveCategory(String name);

	@Query(value = "SELECT * FROM criteo.campaign " +
			"ORDER BY bid " +
			"LIMIT 1",
			nativeQuery = true)
	CampaignEntity getHighestBidProduct();
}
