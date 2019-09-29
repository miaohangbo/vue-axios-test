package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 54110 on 2019-09-23.
 */
@Entity
@Table(name = "user_login")
@Data
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String userName;
    private String password;

    private String address;
}
