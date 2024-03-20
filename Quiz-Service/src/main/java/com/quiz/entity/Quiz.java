package com.quiz.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long quizID;

	private String title;

	@Transient
	private List<Question> questions;

	public Quiz() {
		super();
	}

	public Quiz(long quizID, String title, List<Question> questions) {
		super();
		this.quizID = quizID;
		this.title = title;
		this.questions = questions;
	}

	public long getQuizID() {
		return quizID;
	}

	public void setQuizID(long quizID) {
		this.quizID = quizID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
