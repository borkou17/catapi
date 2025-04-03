package com.example.catapi;

import com.example.catapi.model.Cat;
import java.util.Arrays;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat(
                "Whiskers",
                3,
                "Siamese",
                Arrays.asList("Playful", "Curious"),
                "Brown",
                "https://placekitten.com/300/300"
        );

        System.out.println("Cat ID: " + cat.getId());
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Personality Traits: " + cat.getPersonalityTraits());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Image URL: " + cat.getImageUrl());
        System.out.println("Created Timestamp: " + cat.getCreatedTimestamp());
    }
}