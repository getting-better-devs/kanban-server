package com.gettingbetter.kambam.service;

import com.gettingbetter.kambam.model.Card;
import com.gettingbetter.kambam.repository.CardRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class CardService {


    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Transactional
    public Card save(Card card) {
        return cardRepository.save(card);
    }


    public List<Card> findAll() {
        return cardRepository.findAll();
    }

}
