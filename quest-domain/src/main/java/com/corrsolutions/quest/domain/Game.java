package com.corrsolutions.quest.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Game  implements java.io.Serializable {

     private Integer gameId;
     //private GameUser gameUser;
     private int score;
     private String elapsedTime;
     private Date createdOn;

    public Game() {
    }

	
    public Game(int score) {
 /*       this.gameUser = gameUser;*/
        this.score = score;
    }
    public Game(int score, String elapsedTime, Date createdOn) {
       //this.gameUser = gameUser;
       this.score = score;
       this.elapsedTime = elapsedTime;
       this.createdOn = createdOn;
    }


    public Integer getGameId() {
        return this.gameId;
    }
    
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
/*@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public GameUser getGameUser() {
        return this.gameUser;
    }
    
    public void setGameUser(GameUser gameUser) {
        this.gameUser = gameUser;
    }*/

    public int getScore() {
        return this.score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public String getElapsedTime() {
        return this.elapsedTime;
    }
    
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }




}


