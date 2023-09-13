package com.criteo.homework.dal;

import com.criteo.homework.model.CampaignEntity;
import com.criteo.homework.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends CrudRepository<CampaignEntity, Integer> {
}
