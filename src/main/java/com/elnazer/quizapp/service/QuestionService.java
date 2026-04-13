package com.elnazer.quizapp.service;

import com.elnazer.quizapp.Question;
import com.elnazer.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions(){

        return questionDao.findAll();
    }
}
