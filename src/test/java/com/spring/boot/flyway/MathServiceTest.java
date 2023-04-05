package com.spring.boot.flyway;

import com.spring.boot.flyway.projection.GetAllMinus;
import com.spring.boot.flyway.projection.GetAllPlus;
import com.spring.boot.flyway.service.MathService;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MathServiceTest {

    @Autowired
    private MathService mathService;

    @ParameterizedTest
    @CsvSource({"1,2", "13,14", "0,3"})
    public void testPlus(int firstInput, int secondInput) {

        int expectedPlus = firstInput + secondInput;

        int result = mathService.plus(firstInput, secondInput);
        List<GetAllPlus> plusList = mathService.getAllPlus();

        assertEquals(expectedPlus, result);
        assertNotNull(plusList);
    }

    @ParameterizedTest
    @CsvSource({"10,2", "14,13", "13,3"})
    public void testMinus(int firstInput, int secondInput) {

        int expectedMinus = firstInput - secondInput;

        int result = mathService.minus(firstInput, secondInput);
        List<GetAllMinus> minusList = mathService.getAllMinus();

        assertEquals(expectedMinus, result);
        assertNotNull(minusList);
    }

    @Test
    public void testPlusList() {

    }
}