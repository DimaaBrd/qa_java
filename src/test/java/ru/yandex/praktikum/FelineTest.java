package ru.yandex.praktikum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food);
        assertFalse(food.isEmpty());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        assertEquals(1,kittensCount);
    }

    @Test
    public void testGetKittensNum() {
        Feline feline = new Feline();
        int kittensNum = feline.getKittens(5);
        assertEquals(5 , kittensNum);
    }
}