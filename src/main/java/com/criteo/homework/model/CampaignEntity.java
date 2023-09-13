package com.criteo.homework.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "campaign")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CampaignEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NonNull
	@Column(name = "start_date")
	private LocalDate startDate;
	@NonNull
	@Column(name = "bid")
	private Float bid;
	@NonNull
	@Column(name = "name")
	private String name;
	@NonNull
	@OneToMany(fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	List<ProductEntity> productEntities;
}