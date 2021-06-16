package com.g18.sla.entity;

import com.g18.sla.model.ClassStudySetId;
import com.g18.sla.model.FolderStudySetId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassStudySet {

    @EmbeddedId
    private ClassStudySetId classStudySetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    @MapsId("classId")
    private Class aClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_set_id")
    @MapsId("studySetId")
    private StudySet studySet;

    private Instant createdDate;
}
