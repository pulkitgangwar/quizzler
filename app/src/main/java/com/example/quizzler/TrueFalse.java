package com.example.quizzler;

public class TrueFalse {

     private int mQuestionId;
     private boolean mAnswer;

     TrueFalse(int questionResourceId,boolean answerResource){
        this.mQuestionId = questionResourceId;
        this.mAnswer = answerResource;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
