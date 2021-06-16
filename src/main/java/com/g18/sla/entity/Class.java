package com.g18.sla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	private User owner;

	@NotBlank(message = "Name is required")
	private String name;

	private String description;
	private Instant createdDate;
	private Instant updateDate;

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<ClassMember> classMembers; //list members of class

	@OneToMany(mappedBy = "studySet")
	private List<ClassStudySet>  classStudySets; //list study sets in class

	@OneToMany(mappedBy = "folder")
	private List<ClassFolder>  classFolders; //list folders in class

}
