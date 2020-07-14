package com.sub.korepetycje.controller;

import com.sub.korepetycje.enities.Person;
import com.sub.korepetycje.repositories.KorepetycjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class KorepetycjeController {

    @Autowired
    private KorepetycjeRepository repo;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("dateTime", LocalDateTime.now());
        model.addAttribute("data", repo.findAll(PageRequest.of(page, 4)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @GetMapping("/q")
    ResponseEntity<List<Person>> readAllTasksaa(Pageable page) {
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/qq")
    ResponseEntity<List<Person>> readAllOwn(Pageable page) {
        return ResponseEntity.ok(repo.findAllByTest_pp());
    }

    @GetMapping("/qqq")
    ResponseEntity<List<Person>> readAllCityy(Pageable page) {
        return ResponseEntity.ok(repo.findAllByCity());
    }

    /**
     There was an unexpected error (type=Internal Server Error, status=500).
     Failed to convert from type [java.util.ArrayList<?>] to type...;
     nested exception is org.springframework.core.convert.ConverterNotFoundException: No converter found capable of converting from type...


     ...
     Caused by: org.springframework.core.convert.ConverterNotFoundException: No converter found capable of converting from type
     */


}
