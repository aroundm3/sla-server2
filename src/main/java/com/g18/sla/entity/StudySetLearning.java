package com.g18.sla.entity;

import com.g18.sla.model.UserStudySetId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudySetLearning {

    @EmbeddedId
    private UserStudySetId userStudySetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_set_id")
    @MapsId("studySetId")
    private StudySet studySet;

    private double progress;
    private double rating;
    private String feedback;

    private Instant startDate;
    private Instant expectedDate;
}
