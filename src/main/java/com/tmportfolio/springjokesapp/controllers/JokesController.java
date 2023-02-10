package com.tmportfolio.springjokesapp.controllers;

import com.tmportfolio.springjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = "/")
    public String getJoke(Model model) {

        model.addAttribute("Joke",jokeService.getJoke());

        return "index";
    }
}