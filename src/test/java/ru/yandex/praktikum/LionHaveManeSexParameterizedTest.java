package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHaveManeSexParameterizedTest {
private String sex;
private boolean expected;

    public LionHaveManeSexParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
public static Object [][]data(){
    return new Object[][]{
            {"Самец", true},
            {"Самка", false}
    };
}

    @Test
    public void doesHaveManeTest () throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());


    }
}