package com.example.jee.dao.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isPublished;
    private LocalDateTime publishDate;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
