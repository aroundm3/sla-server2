package com.g18.sla.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ClassStudySetId implements Serializable {

    @Column(name = "class_id")
    private Long classId;

    @Column(name = "study_set_id")
    private Long studySetId;
}
