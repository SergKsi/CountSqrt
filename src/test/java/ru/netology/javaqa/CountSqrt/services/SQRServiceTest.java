package ru.netology.javaqa.CountSqrt.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.javaqa.CountSqrt.services.SQRService;

public class SQRServiceTest {

    @Test
    public void testSqrInRangeStart100End200() {
        SQRService service = new SQRService();

//        int firstDigit = 10; // начальное число перебора
//        int lastDigit = 99; // конечное число перебора
        int rangeStart = 200; // начало диапазона
        int rangeEnd = 300; // конец диапазона

        int expected = 3;
        int actual = service.countSqrt(rangeStart, rangeEnd);
//        System.out.println(expected + " ==?== " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrInRangeStart200End500() {
        SQRService service = new SQRService();

//        int firstDigit = 10; // начальное число перебора
//        int lastDigit = 99; // конечное число перебора
        int rangeStart = 200; // начало диапазона
        int rangeEnd = 500; // конец диапазона

        int expected = 8;
        int actual = service.countSqrt(rangeStart, rangeEnd);
//        System.out.println(expected + " ==?== " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSqrInRangeStart1End15000() {
        SQRService service = new SQRService();

//        int firstDigit = 10; // начальное число перебора
//        int lastDigit = 99; // конечное число перебора
        int rangeStart = 1; // начало диапазона
        int rangeEnd = 15000; // конец диапазона

        int expected = 90;
        int actual = service.countSqrt(rangeStart, rangeEnd);
//        System.out.println(expected + " ==?== " + actual);
        Assertions.assertEquals(expected, actual);
    }
}

