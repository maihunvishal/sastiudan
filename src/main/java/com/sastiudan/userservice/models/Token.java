package com.sastiudan.userservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Token  extends BaseModel{

    private String Value;
    @ManyToOne
    private User user;
    private Date expiryDate;

}
