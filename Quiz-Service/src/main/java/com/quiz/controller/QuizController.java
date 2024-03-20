package com.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService quizService;
	
	
	@GetMapping("/getquiz")
	public Quiz getQuiz(@RequestParam("quizID") Long quizID) {
		return quizService.getQuiz(quizID);
	}
	

}
