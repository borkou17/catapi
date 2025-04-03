package com.example.catapi.controller;

import com.example.catapi.model.Cat;
import com.example.catapi.service.CatService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(CatController.class)
public class CatControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CatService catService;

    @Test
    public void testGetRandomCat() throws Exception {
        Cat cat = new Cat("1", "Whiskers", "Unknown", 3, "Black");
        when(catService.generateRandomCat()).thenReturn(cat);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/cats/random"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.name").value("Whiskers"))
                .andExpect(jsonPath("$.breed").value("Unknown"))
                .andExpect(jsonPath("$.age").value("3"))
                .andExpect(jsonPath("$.color").value("Black"));
    }
}
