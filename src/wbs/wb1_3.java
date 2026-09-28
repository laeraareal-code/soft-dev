package src.wbs;

import java.util.*;

public class wb1_3
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.next();

        int d1 = isbn.charAt(0) - '0';
        int d2 = isbn.charAt(1) - '0';
        int d3 = isbn.charAt(2) - '0';
        int d4 = isbn.charAt(3) - '0';
        int d5 = isbn.charAt(4) - '0';
        int d6 = isbn.charAt(5) - '0';
        int d7 = isbn.charAt(6) - '0';
        int d8 = isbn.charAt(7) - '0';
        int d9 = isbn.charAt(8) - '0';

        char lastChar = isbn.charAt(9);

        int d10 = (lastChar == 'X' || lastChar == 'x') ? 10 : (lastChar - '0');

        int sum = 10 * d1 + 9 * d2 + 8 * d3 + 7 * d4 + 6 * d5 + 5 * d6 + 4 * d7 + 3 * d8 + 2 * d9 + 1 * d10;

        String result = (sum % 11 == 0) ? "корректный" : "некорректный";

        System.out.printf("Сумма: %d%n", sum);
        System.out.printf("Результат: %s%n", result);
    }
}
