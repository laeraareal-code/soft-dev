package src.wbs;

import java.util.*;

public class wb2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBid = 0; int declined = 0; int winner = 0;

        for (int i = 1; i <= 6; i++) {
            int bid = scanner.nextInt();
            if (bid < 100 || bid > 5000) { declined++; continue; }
            if (bid > maxBid) { winner = i; maxBid = bid; }
        }

        if (maxBid == 0) { System.out.println("Победитель не определён"); } else {
            System.out.printf("Победитель: %d, ставка: %d%n", winner, maxBid);
        }
        System.out.printf("Отклонено: %d%n", declined);
    }
}
