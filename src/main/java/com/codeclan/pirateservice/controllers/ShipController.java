package com.codeclan.pirateservice.controllers;

import com.codeclan.pirateservice.models.Ship;
import com.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/ships")
public class ShipController {
    @Autowired
    ShipRepository shipRepository;
    //get all pirates
    @GetMapping
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Ship> getShip(@PathVariable Long id){
        return shipRepository.findById(id);
    }

}
