package com.quiz.service;

import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;

@Service
public interface QuizService {

	Quiz getQuiz(Long quizID);

}
