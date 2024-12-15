package com.sastiudan.userservice.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class signUpRequestDto {
    private String email;
    private String password;
    private String name;
}
