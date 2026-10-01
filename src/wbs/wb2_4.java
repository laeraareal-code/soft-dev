package src.wbs;

import java.util.*;

public class wb2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); int L = scanner.nextInt();
        int check = 0; int n; int l;
        do {
            n = N; l = 0;
            do {
                if (n % 2 == 0) {n /= 2;
                } else {n = (n * 3) + 1;}
                l++;
            } while (n != 1);
            N++;
            check++;
            if (check == 1000) { System.out.print("Не найдено"); return; }
        } while (l < L);
        n = N - 1;
        System.out.println(n);

        l = 0; int maxN = 0;
        do {
            if (n % 2 == 0) {n /= 2;}
            else {n = (n * 3) + 1;}
            l++;
            if (n > maxN) {maxN = n;}
            System.out.println(n);
        } while (n != 1);
        n = N - 1;
        System.out.printf("Число: %d%n", n);
        System.out.printf("Шагов: %d%n", l);
        System.out.printf("Максимум: %d%n", maxN);
    }
}
