package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.quiz.dao.QuizDAO;
import com.quiz.entity.Question;
import com.quiz.entity.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizDAO quizDAO;
	
	@Autowired
	private QuestionClient questionClient;

	@Override
	public Quiz getQuiz(Long quizID) {
		Quiz quiz = quizDAO.findById(quizID).get();

//		RestTemplate restTemplate = new RestTemplate();
//		String url = "http://localhost:8091/question/getquestion/" + quizID;
//		List<Question> questions = restTemplate.getForObject(url, List.class);
		
		List<Question> questions= this.questionClient.getQuestionOfQuiz(quizID);
		quiz.setQuestions(questions);

		return quiz;
	}

}
