package com.gettingbetter.kambam.controllers;

import com.gettingbetter.kambam.dtos.CardDto;
import com.gettingbetter.kambam.model.Task;
import com.gettingbetter.kambam.service.CardService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class KambamController {

    private final CardService cardService;

    public KambamController( CardService cardService) {
        this.cardService = cardService;
    }


    @PostMapping()
    public ResponseEntity<Object> saveCard(@RequestBody @Valid CardDto cardDto) {
        Task card = new Task();
        BeanUtils.copyProperties(cardDto, card);
        return ResponseEntity.status(HttpStatus.CREATED).body(cardService.save(card));
    }

    @GetMapping
    public ResponseEntity<List<Task>> listAllCards(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.findAll());
    }

    }

