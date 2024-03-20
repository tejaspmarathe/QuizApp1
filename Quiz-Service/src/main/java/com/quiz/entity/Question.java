package com.quiz.entity;

public class Question {
	
private Long questionID;
	
	private String title;
	
	private String quizID;

	public Question() {
		super();
	}

	public Question(Long questionID, String title, String quizID) {
		super();
		this.questionID = questionID;
		this.title = title;
		this.quizID = quizID;
	}

	public Long getQuestionID() {
		return questionID;
	}

	public void setQuestionID(Long questionID) {
		this.questionID = questionID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuizID() {
		return quizID;
	}

	public void setQuizID(String quizID) {
		this.quizID = quizID;
	}


}
