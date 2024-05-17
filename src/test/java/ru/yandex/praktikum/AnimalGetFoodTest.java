package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalGetFoodTest(String animalKind, List<String> expectedFood){
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object [][]{
                {"Травоядное" , List.of("Трава", "Различные растения")},
                {"Хищник" , List.of("Животные", "Птицы", "Рыба")}
        });
    }


    @Test
    public void getFoodTest() {
        Animal animal = new Animal();
        try{
            List<String> actualFood = animal.getFood(animalKind);
            assertEquals(expectedFood, actualFood);
        } catch(Exception exception){
        fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
    }
    }
    }
