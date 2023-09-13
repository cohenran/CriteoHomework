package com.criteo.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private String price;

	@Column(name = "product_serial_number")
	private String productSerialNumber;
}