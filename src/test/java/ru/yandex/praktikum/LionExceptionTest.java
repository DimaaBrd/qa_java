package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самец или самка";
    private String sex;
    private boolean expected;

    public LionExceptionTest(String sex) {
        this.sex = sex;

    }

    @Parameterized.Parameters
    public static Object [][]data(){
        return new Object[][]{
                {"nonbinary"},
                {null}
        };
    }

    @Test
    public void doesHaveManeTest()  {
        IndexOutOfBoundsException indexOutOfBoundsException= assertThrows(IndexOutOfBoundsException.class,() -> {
            new Lion(sex, null);
        });
        Assert.assertEquals(EXPECTED_ERROR, indexOutOfBoundsException.getMessage());
    }
}