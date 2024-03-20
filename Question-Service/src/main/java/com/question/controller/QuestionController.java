package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/create")
	public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
		return questionService.createQuestion(question);
	}

	@GetMapping("/getquestion/{quizId}")
	public ResponseEntity<List<Question>> getMethodName(@PathVariable("quizId") String quizId) {
		System.out.println("8092");
		return questionService.getQuestionByQuiz(quizId);
	}

	

	
}
