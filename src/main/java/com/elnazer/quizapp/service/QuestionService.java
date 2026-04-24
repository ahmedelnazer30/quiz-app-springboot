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
    public ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
    }
    public List<Question> getQuestionsByCategory(String category){
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }
}
