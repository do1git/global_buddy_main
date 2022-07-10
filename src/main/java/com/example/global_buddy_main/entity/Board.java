package com.example.global_buddy_main.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOARD")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "member")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_ID")
    private Long id;

    @Column(name = "BOARD_TITLE")
    private String title;

    @Column(name = "BOARD_CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "BOARD_MEMBER")
    private Member member;

    @OneToMany(mappedBy = "id")
    private List<BoardFile> boardFileList;
}
