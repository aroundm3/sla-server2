package com.g18.sla.entity;

import com.g18.sla.model.ClassFolderId;
import com.g18.sla.model.ClassMemberId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassFolder {

    @EmbeddedId
    private ClassFolderId classFolderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id")
    @MapsId("folderId")
    private Folder folder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    @MapsId("classId")
    private Class aClass;

    private Instant createdDate;
}
