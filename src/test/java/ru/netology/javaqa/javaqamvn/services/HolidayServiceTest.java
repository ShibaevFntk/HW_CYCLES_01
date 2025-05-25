package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void testHolidayCount1() {

        ServiceHoliday service = new ServiceHoliday();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHolidayCount2() {

        ServiceHoliday service = new ServiceHoliday();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

}
