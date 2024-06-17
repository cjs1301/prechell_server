package com.api.prechell.legacy.entity;

import com.api.prechell.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "support")
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supportId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private MemberEntity memberEntity;

    @Column(length = 100)
    private String inquiryType;

    @Column(length = 500)
    private String inquiryContent;

    @Column(length = 500)
    private String responseContent;

    private LocalDateTime responseDate;

}