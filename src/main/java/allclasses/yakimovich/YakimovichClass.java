package allclasses.yakimovich;

import java.util.ArrayList;
import java.util.List;

public class YakimovichClass {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // Обработка нулевого значения для умножения
        }
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }

        return a / b;
    }

    public List<Integer> generateEvenNumbers(int n) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
