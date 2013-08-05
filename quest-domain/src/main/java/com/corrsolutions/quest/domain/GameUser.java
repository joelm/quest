package com.corrsolutions.quest.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class GameUser  implements Serializable {

    private Integer userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date createdOn;
    private Set<Game> games = new HashSet<Game>(0);


    public GameUser() {
    }

    public GameUser(String u, String password) {
        this.userName = u;
        this.password = password;
    }

    public GameUser(String u, String firstName, String lastName,
                    String email, String password, Date createdOn, Set<Game> games) {
       this.userName = u;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.createdOn = createdOn;
       this.games = games;
    }


    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }


    public Set<Game> getGames() {
        return this.games;
    }
    
    public void setGames(Set<Game> games) {
        this.games = games;
    }


}


