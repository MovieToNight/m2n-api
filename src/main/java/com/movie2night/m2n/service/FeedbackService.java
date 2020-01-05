package com.movie2night.m2n.service;

import com.movie2night.m2n.pojo.Feedback;
import com.movie2night.m2n.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void save(String message) {
        feedbackRepository.save(new Feedback(message));
    }
}
