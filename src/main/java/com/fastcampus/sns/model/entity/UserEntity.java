package com.fastcampus.sns.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class UserEntity {

    @Id
    @Getter
    @Setter
    private Integer id;


    @Column(name = "user_name")
    @Getter
    @Setter
    private String userName;

    @Column(name = "password")
    @Getter
    @Setter
    private String password;
}
