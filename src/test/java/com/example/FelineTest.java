package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    Feline felineSpy;

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineSpy.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = felineSpy.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFamily() {
        String expectedValue = "Кошачьи";
        assertEquals(expectedValue, felineSpy.getFamily());
    }

    @Test
    public void testGetKittens() {
        int expectedValue = 1;
        Mockito.when(felineSpy.getKittens(1)).thenReturn(expectedValue);
        assertEquals(expectedValue, felineSpy.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() {
        int expectedValue = 1;
        assertEquals(expectedValue, felineSpy.getKittens(expectedValue));
    }
}
