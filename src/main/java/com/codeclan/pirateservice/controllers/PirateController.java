package com.codeclan.pirateservice.controllers;

import com.codeclan.pirateservice.models.Pirate;
import com.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/pirates")
public class PirateController {
    @Autowired
    PirateRepository pirateRepository;
    //get all pirates
    @GetMapping
    public List<Pirate>getAllPirates(){
        return pirateRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }

}
