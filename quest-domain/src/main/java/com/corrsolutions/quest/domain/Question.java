package com.corrsolutions.quest.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


public class Question  implements Serializable {

    private Integer questionId;
    private String question;
    private String category;
    private Answer answer;
    private Date createdOn;
    private Set<QuestionAnswer> questionAnswers;


    public Question() {
    }

    public Question(Integer questionId, Answer answer, String question) {
        this.questionId = questionId;
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

    public Set<QuestionAnswer> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(Set<QuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }
}


