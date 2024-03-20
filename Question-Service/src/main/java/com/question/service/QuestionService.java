package com.question.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.question.entity.Question;

@Service
public interface QuestionService {

	ResponseEntity<Question> createQuestion(Question question);

	ResponseEntity<List<Question>> getQuestionByQuiz(String quizId);

}
