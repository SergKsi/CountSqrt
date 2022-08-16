package ru.netology.javaqa.CountSqrt.services;

public class SQRService {
    public int countSqrt(int rangeStart, int rangeEnd) {
        int firstDigit = 10; // начало диапазона
        int lastDigit = 99; // конец диапазона
        int countDigitSqrt = 0; // кол-во чисел

        double sqrtRezult = firstDigit * firstDigit; // квадрат чисел

        // перебор чисел в диапазоне
        for (int i = firstDigit; i <= lastDigit; i++) {
            // если квадрат чисел входит в диапазон увеличиваем счетчик кол-ва чисел
            if ((sqrtRezult >= rangeStart) && (sqrtRezult <= rangeEnd)) {
                countDigitSqrt++;
            }
            sqrtRezult = i * i; // квадрат чисел

            // если вышли из диапазона, то перебеирать больше не нужно - выходим из цикла
            if (sqrtRezult > rangeEnd) {
                break;
            }
        }
        return countDigitSqrt;
    }
}
