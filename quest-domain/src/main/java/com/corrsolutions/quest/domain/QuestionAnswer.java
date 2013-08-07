package com.corrsolutions.quest.domain;


import java.util.Date;

public class QuestionAnswer {

    private Integer questAnswerId;
    private Integer questionId;
    private Integer answerId;
    private Date createdOn;


    public QuestionAnswer() {
    }

    public QuestionAnswer(Integer questAnswerId, Integer questionId, Integer answerId, Date createdOn) {
        this.questAnswerId = questAnswerId;
        this.questionId = questionId;
        this.answerId = answerId;
        this.createdOn = createdOn;
    }

    public Integer getQuestAnswerId() {
        return questAnswerId;
    }

    public void setQuestAnswerId(Integer questAnswerId) {
        this.questAnswerId = questAnswerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}
