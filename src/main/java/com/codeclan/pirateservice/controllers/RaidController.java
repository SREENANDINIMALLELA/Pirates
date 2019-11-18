package com.codeclan.pirateservice.controllers;

import com.codeclan.pirateservice.models.Raid;
import com.codeclan.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/raids")
public class RaidController {

        @Autowired
        RaidRepository raidRepository;
        //get all pirates
        @GetMapping
        public List<Raid> getAllRaids(){
            return raidRepository.findAll();
        }
        @GetMapping("{id}")
        // returns if id is present and nul if id not present in the table
        public Optional<Raid> getRaid(@PathVariable Long id){
            return raidRepository.findById(id);
        }


    }
