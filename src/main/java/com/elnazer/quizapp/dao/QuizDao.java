package com.elnazer.quizapp.dao;

import com.elnazer.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
