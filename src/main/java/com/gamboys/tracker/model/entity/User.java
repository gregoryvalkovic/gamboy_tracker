package com.gamboys.tracker.model.entity;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User {
    @Id
    private long steam32Id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String profileURL;

    @Column(nullable = false)
    private String avatarMedium;

    @Column(nullable = false)
    private String avatarFull;


}
