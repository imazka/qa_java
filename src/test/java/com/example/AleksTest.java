package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AleksTest {
    @Mock
    Feline felineMock;
    Aleks aleks;

    @BeforeEach
    public void setUp() throws Exception {
        aleks = new Aleks(felineMock);
    }

    @Test
    public void testAleksConstructor() throws Exception {
        assertTrue(aleks.doesHaveMane());
        assertEquals(felineMock, aleks.getFeline());
    }

    @Test
    public void testGetFriends() throws Exception {
        String expectedValue = "{Зебра=Марти, Бегемотиха=Глория, Жираф=Мелман}";
        assertEquals(expectedValue, aleks.getFriends().toString());
    }

    @Test
    public void testGetPlaceOfLiving() {
        String expectedValue = "Нью-Йоркский зоопарк";
        assertEquals(expectedValue, aleks.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        assertEquals(0, aleks.getKittens());
    }
}
