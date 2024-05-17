package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGetFamilyTest {

        @Test
        public void getFamilyTest() {
            Animal animal = new Animal();
            String actualFamily = animal.getFamily();
            String expectedFamily = ("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
            assertEquals(expectedFamily, actualFamily);
        }
    }
