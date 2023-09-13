package com.criteo.homework.model;

import lombok.*;

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

	@NonNull
	@Column(name = "title")
	private String title;

	@NonNull
	@Column(name = "category")
	private String category;

	@NonNull
	@Column(name = "price")
	private String price;

	@NonNull
	@Column(name = "product_serial_number")
	private String productSerialNumber;
}