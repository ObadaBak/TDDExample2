package org.example;

//STUDENT NUMBER: B221202555
//NAME: OBADA BAKFALOUNI
//GITHUB REPO ADDRESS: https://github.com/ObadaBak/TDDExample2


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

class CalculatorParameterizedTest {

    @ParameterizedTest
    @MethodSource("divisionTestData")
    void testDivision(float a, float b, float expectedResult) {
        assertEquals(expectedResult, Calculator.divide(a, b));
    }

    private static Stream<Object[]> divisionTestData() {
        return Stream.of(
                // Test data: a, b, expectedResult
                new Object[]{10f, 2f, 5f},
                new Object[]{10f, 4f, 2.5f},
                new Object[]{12.5f, 2.5f, 5f},
                new Object[]{10f, 2.5f, 4f},
                new Object[]{12.5f, 5f, 2.5f}
        );
    }
}

