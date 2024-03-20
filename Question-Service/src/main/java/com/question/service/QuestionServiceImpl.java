package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.question.dao.QuestionDAO;
import com.question.entity.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDAO questionDAO;

	@Override
	public ResponseEntity<Question> createQuestion(Question question) {
		questionDAO.save(question);
		return new ResponseEntity<Question>(question, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<Question>> getQuestionByQuiz(String quizId) {
		List<Question> questionList = questionDAO.findByQuizID(quizId);
		return new ResponseEntity<>(questionList, HttpStatus.OK);
	}

}
