package com.gettingbetter.kambam.repository;

import com.gettingbetter.kambam.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
    boolean existsByTituloNotNull(String licensePlateCar);
    boolean existsByParkingSpotNumber (String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
