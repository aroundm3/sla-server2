package com.g18.sla.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudySet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creator_id")
	private User creator;

	@NotBlank(message = "Title is required")
	private String title;
	private String description;
	private String tag;
	private boolean isPublic;

//	@OneToMany(mappedBy = "studySet", cascade = CascadeType.ALL)
//	private List<Card> cards;

}
