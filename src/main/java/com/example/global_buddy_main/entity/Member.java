package com.example.global_buddy_main.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MEMBER")
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MEMBER_NAME")
    @NotNull
    private String name;

    @Column(name = "MEMBER_EMAIL")
    @NotNull
    private String email;

    @Column(name = "MEMBER_PW")
    private String password;

    @Column(name = "MEMBER_ADMIN")
    private Boolean admin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_TEAM")
    private Team team;

    private String pic_uuid;

    private String pic_fileName;

    private String pic_path;


    // ADMIN LEADER NAME  EMAIL. PW. TEAM LEADER
}
