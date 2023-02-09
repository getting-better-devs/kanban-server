package com.gettingbetter.kambam.repository;

import com.gettingbetter.kambam.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Task, UUID> {
}
