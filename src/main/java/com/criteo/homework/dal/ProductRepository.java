package com.criteo.homework.dal;

import com.criteo.homework.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
	List<ProductEntity> findByProductSerialNumberIn(List<String> productSerialNumber);
}
