package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline mockFeline;
    Cat cat;

    @BeforeEach
    public void setUp() {
        cat = new Cat(mockFeline);
    }

    @Test
    public void testConstructor() {
        assertEquals(mockFeline, cat.getPredator());
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedValue = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(expectedValue);
        assertEquals(expectedValue, cat.getFood());
    }
}
