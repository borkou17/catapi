package com.example.catapi.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Cat {
    private String id;
    private String name;
    private int age;
    private String breed;
    private List<String> personalityTraits;
    private String color;
    private String imageUrl;
    private LocalDateTime createdTimestamp;

    // Конструктори
    public Cat() {
        this.id = UUID.randomUUID().toString();
        this.createdTimestamp = LocalDateTime.now();
    }

    public Cat(String name, int age, String breed, List<String> personalityTraits, String color, String imageUrl) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.personalityTraits = personalityTraits;
        this.color = color;
        this.imageUrl = imageUrl;
        this.createdTimestamp = LocalDateTime.now();
    }

    // Гетъри и сетъри
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<String> getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(List<String> personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }
}