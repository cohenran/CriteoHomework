package com.criteo.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

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

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "bid")
	private Float bid;
	
	@Column(name = "name")
	private String name;

	@Column(name = "title")
	private String title;
}