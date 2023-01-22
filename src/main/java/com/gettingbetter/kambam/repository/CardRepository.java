package com.gettingbetter.kambam.repository;

import com.gettingbetter.kambam.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
