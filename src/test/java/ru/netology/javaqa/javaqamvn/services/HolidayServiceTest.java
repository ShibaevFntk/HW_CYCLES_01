package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/HolidayServiceTest.csv")

    public void testHolidayCount() {

        ServiceHoliday service = new ServiceHoliday();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }

}
