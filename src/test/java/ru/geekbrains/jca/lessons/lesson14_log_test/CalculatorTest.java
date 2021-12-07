package ru.geekbrains.jca.lessons.lesson14_log_test;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void globalInit() {
        System.out.println("Global INIT");
    }

    @AfterAll
    static void globalClose() {
        System.out.println("Global CLOSE");
    }



    @BeforeEach
    void init() {
        System.out.println("Creating new calculator");
        calculator = new Calculator();
    }

    @AfterEach
    void close() {
        System.out.println("Closing resource after test");
    }

    @Test
    @Disabled
    void add() {
        int a = 10;
        int b = 14;
        int result = 24;
        Assertions.assertEquals(result, calculator.add(a, b));
        Assertions.assertEquals(3, calculator.add(1, 2));
        Assertions.assertEquals(4, calculator.add(1, 3));
        Assertions.assertEquals(6, calculator.add(4, 2));
        Assertions.assertEquals(6, calculator.add(5, 1));
    }

    @Test
    void sub() {
        Assertions.assertEquals(10, calculator.sub(20, 10));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void mul() {
        Assertions.assertEquals(20, calculator.mul(4, 5));
    }

    @Test
    @DisplayName("Divide throw test")
    void shouldThrowArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(55, 0));
    }

//    @CsvSource({
//            "1,2,3",
//            "4,5,9",
//            "9,1,10",
//            "9,8,17"
//    })
//    @CsvFileSource(files = {"test_files/t1.csv", "test_files/t2.csv"})
    @MethodSource("generateTestData")
    @ParameterizedTest
    void massAddTest(int a, int b, int result) {
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    public static Stream<Arguments> generateTestData() {
        int value = 100_000;
        List<Arguments> list = new LinkedList<>();
        for (int i = 0; i < value; i++) {
            int a = (int) (Math.random() * value);
            int b = (int) (Math.random() * value);
            int result = a + b;
            list.add(Arguments.arguments(a, b, result));
        }
        return list.stream();
    }
}