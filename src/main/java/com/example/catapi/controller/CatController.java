package com.example.catapi.controller;

import com.example.catapi.model.Cat;
import com.example.catapi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    @Autowired
    private CatService catService;

    // Метод за генериране на случайна котка
    @GetMapping("/random")
    public Cat getRandomCat() {
        return catService.generateRandomCat();
    }

    // Метод за генериране на определен брой случайни котки
    @GetMapping("/random")
    public List<Cat> getRandomCats(@RequestParam int count) {
        return catService.generateRandomCats(count);
    }

    // Метод за получаване на котка по ID
    @GetMapping("/{id}")
    public Cat getCatById(@PathVariable String id) {
        return catService.getCatById(id);
    }

    // Метод за генериране на случайно име на котка
    @GetMapping("/names/random")
    public String getRandomCatName() {
        return catService.generateRandomCatName();
    }

    // Метод за генериране на случайни черти на котка
    @GetMapping("/traits/random")
    public List<String> getRandomCatTraits() {
        return catService.generateRandomCatTraits();
    }
}
