package src.wbs;

import java.util.*;

public class wb2_2 {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();

        int code = (100 * r) + (y * 10) + (g);
        switch (code) {
            case 100: System.out.print("Стой"); break;
            case 10: System.out.print("Внимание"); break;
            case 1: System.out.print("Путь свободен"); break;
            case 110: System.out.print("Стой, приготовиться"); break;
            case 11: System.out.print("Снизить скорость"); break;
            case 101, 111: System.out.print("Ошибка: несовместимые сигналы"); break;
            case 0: System.out.print("Ошибка: сигнал не подан"); break;
            default: break;
        }
    }
}