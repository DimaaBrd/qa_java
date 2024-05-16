package ru.yandex.praktikum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline );
        feline.getKittens(1); // вызвали метод с аргументом
        // проверили, что метод вызван с нужным параметром
        assertEquals(lion.getKittens(), Mockito.verify(feline).getKittens(1));
    }


    @Test
    public void shouldReturnMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood,lion.getFood());
    }
}