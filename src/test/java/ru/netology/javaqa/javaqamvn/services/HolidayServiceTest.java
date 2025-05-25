package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/HolidayServiceTest.csv")

    public void testHolidayCount(int income, int expenses, int threshold, int expected) {

        ServiceHoliday service = new ServiceHoliday();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
