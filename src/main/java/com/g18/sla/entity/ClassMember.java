package com.g18.sla.entity;

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
public class ClassMember {

    @EmbeddedId
    private ClassMemberId classMemberId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    @MapsId("memberId")
    private User member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    @MapsId("classId")
    private Class aClass;

    private Instant enrolledDate;

}
