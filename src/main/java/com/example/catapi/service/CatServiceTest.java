package com.example.catapi.service;

import com.example.catapi.config.CatApiConfig;
import com.example.catapi.model.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CatServiceTest {

    @Mock
    private CatApiConfig catApiConfig;

    @InjectMocks
    private CatService catService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(catApiConfig.getDefaultCatName()).thenReturn("Whiskers");
        when(catApiConfig.getDefaultCatBreed()).thenReturn("Unknown");
    }

    @Test
    public void testGenerateRandomCat() {
        Cat cat = catService.generateRandomCat();
        assertEquals("Unknown", cat.getBreed());
    }

    @Test
    public void testGenerateRandomCats() {
        List<Cat> cats = catService.generateRandomCats(5);
        assertEquals(5, cats.size());
    }

    @Test
    public void testGetCatById() {
        Cat cat = catService.getCatById("1");
        assertEquals("Whiskers", cat.getName());
        assertEquals("Unknown", cat.getBreed());
    }
}
