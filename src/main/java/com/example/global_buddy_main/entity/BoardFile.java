package com.example.global_buddy_main.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String fileName;

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;
}

