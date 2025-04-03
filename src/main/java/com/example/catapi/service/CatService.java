package com.example.catapi.service;

import com.example.catapi.config.CatApiConfig;
import com.example.catapi.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class CatService {

    @Autowired
    private CatApiConfig catApiConfig;

    private final Random random = new Random();

    public Cat generateRandomCat() {
        return new Cat(UUID.randomUUID().toString(), generateRandomCatName(), catApiConfig.getDefaultCatBreed(), random.nextInt(15) + 1, generateRandomColor());
    }

    public List<Cat> generateRandomCats(int count) {
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cats.add(generateRandomCat());
        }
        return cats;
    }

    public Cat getCatById(String id) {
        return new Cat(id, catApiConfig.getDefaultCatName(), catApiConfig.getDefaultCatBreed(), 3, "Sample Color");
    }

    public String generateRandomCatName() {
        String[] names = {"Whiskers", "Shadow", "Mittens", "Simba", "Nala"};
        return names[random.nextInt(names.length)];
    }

    public List<String> generateRandomCatTraits() {
        String[] traits = {"Playful", "Curious", "Lazy", "Friendly", "Aggressive"};
        List<String> randomTraits = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomTraits.add(traits[random.nextInt(traits.length)]);
        }
        return randomTraits;
    }

    private String generateRandomColor() {
        String[] colors = {"Black", "White", "Gray", "Orange", "Brown"};
        return colors[random.nextInt(colors.length)];
    }
}