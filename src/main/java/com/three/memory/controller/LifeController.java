package com.three.memory.controller;

import com.three.memory.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifeController {

    @Autowired
    private LifeService service;
}
