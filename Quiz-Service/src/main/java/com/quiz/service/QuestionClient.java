package com.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entity.Question;

//@FeignClient(url = "http://localhost:8091",value = "Question-Client")
@FeignClient(name ="QUESTION-SERVICE")
public interface QuestionClient {

	@GetMapping("/question/getquestion/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable ("quizId") Long quizId);
}
