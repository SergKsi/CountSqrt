import ru.netology.javaqa.CountSqrt.services.SQRService;

public class Main {

    public static void main(String[] args) {
        int firstDigit = 10; // начальное число перебора
        int lastDigit = 99; // конечное число перебора
        int rangeStart = 200; // начало диапазона
        int rangeEnd = 300; // конец диапазона

        SQRService service = new SQRService();
        // вычисление кол-во квадратов в заданных интервалах
        int countDigitSqrt = service.countSqrt(rangeStart, rangeEnd);
        System.out.println("Кол-во квадратов чисел от " + firstDigit + " до " + lastDigit + ", входящих в диапазоне от " + rangeStart + " до " + rangeEnd + " = " + countDigitSqrt);
    }
}
