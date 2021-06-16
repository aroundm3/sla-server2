package com.g18.sla.entity;

import com.g18.sla.model.FolderStudySetId;
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
public class FolderStudySet {

    @EmbeddedId
    private FolderStudySetId userStudySetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id")
    @MapsId("folderId")
    private Folder folder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_set_id")
    @MapsId("studySetId")
    private StudySet studySet;

    private Instant createdDate;
}
