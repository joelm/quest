package com.corrsolutions.domain;// default package
// Generated 29-Jul-2013 09:30:26 by Hibernate Tools 3.2.2.GA


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

/**
 * com.corrsolutions.domain.Question generated by hbm2java
 */
@Entity
@Table(name="question"
    ,catalog="quest"
)
public class Question  implements java.io.Serializable {


     private Integer questionId;
     private Answer answer;
     private String question;
     private String category;
     private Date createdOn;

    public Question() {
    }

	
    public Question(Answer answer, String question) {
        this.answer = answer;
        this.question = question;
    }
    public Question(Answer answer, String question, String category, Date createdOn) {
       this.answer = answer;
       this.question = question;
       this.category = category;
       this.createdOn = createdOn;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="question_id", nullable=false)
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="answer_id", nullable=false)
    public Answer getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
    
    @Column(name="question", nullable=false, length=50)
    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    @Column(name="category", length=50)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }




}


