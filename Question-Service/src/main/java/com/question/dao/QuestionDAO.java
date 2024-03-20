package com.question.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.question.entity.Question;

public interface QuestionDAO extends JpaRepository<Question, Long> {
    List<Question> findByQuizID(String quizID);



}
