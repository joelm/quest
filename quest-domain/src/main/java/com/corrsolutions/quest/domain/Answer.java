package com.corrsolutions.quest.domain;

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


@Entity
@Table(name="answer"
    ,catalog="quest"
)
public class Answer  implements java.io.Serializable {


     private Integer answerId;
     private String answer;
     private Date createdOn;
     private Set<Question> questions = new HashSet<Question>(0);

    public Answer() {
    }


    public Answer(String answer) {
        this.answer = answer;
    }
    public Answer(String answer, Date createdOn, Set<Question> questions) {
       this.answer = answer;
       this.createdOn = createdOn;
       this.questions = questions;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    @Column(name="answer_id", nullable=false)
    public Integer getAnswerId() {
        return this.answerId;
    }
    
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    @Column(name="answer", nullable=false, length=50)
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="answer")
    public Set<Question> getQuestions() {
        return this.questions;
    }
    
    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }




}


