package com.my.system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String phone;
}
