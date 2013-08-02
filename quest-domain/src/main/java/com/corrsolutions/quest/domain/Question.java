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


@Entity @Table(name="question",catalog="quest")
public class Question  implements java.io.Serializable {

    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="question_id", nullable=false)
    private Integer questionId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="answer_id", nullable=false)
    private Answer answer;

    @Column(name="question", nullable=false, length=50)
    private String question;

    @Column(name="category", length=50)
    private String category;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
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

    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Answer getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }




}


