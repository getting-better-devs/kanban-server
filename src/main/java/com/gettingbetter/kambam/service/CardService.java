package com.gettingbetter.kambam.service;

import com.gettingbetter.kambam.model.Task;
import com.gettingbetter.kambam.repository.CardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {


    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Transactional
    public Task save(Task card) {
        return cardRepository.save(card);
    }


    public List<Task> findAll() {
        return cardRepository.findAll();
    }

}
