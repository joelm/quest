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


public class Answer  implements Serializable {

     private Integer answerId;
     private String answer;
     private Date createdOn;

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public Answer(String answer, Date createdOn) {
       this.answer = answer;
       this.createdOn = createdOn;
    }

    public Integer getAnswerId() {
        return this.answerId;
    }
    
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }



}


