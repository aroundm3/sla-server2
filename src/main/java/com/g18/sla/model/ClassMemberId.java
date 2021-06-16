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
public class ClassMemberId implements Serializable {
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "class_id")
    private Long classId;
}
