package com.example.global_buddy_main.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TEAM")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Team {

    @Id
    @Column(name = "TEAM_DEF")
    private String department;
    //DEf_PRS adm prm vdo pln

    @OneToMany(mappedBy = "id")
    private List<Member> memberList = new ArrayList<>();

}
