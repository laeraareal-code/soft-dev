package src.wbs;

import java.util.*;

public class wb2_3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int defense = 3;
        int mana = 50;

        int moves = 0;
        int skippedMoves = 0;
        int initialDefense = 3;

        while (health > 0) {
            int spell = scanner.nextInt();

            if (spell == 0) {break;}

            moves++;
            int damage = 0;
            boolean isSkipped = false;

            switch (spell) {
                case 1:
                    if (mana < 10) {
                        System.out.println("Недостаточно маны, ход пропускается.");
                        isSkipped = true;
                    } else {
                        mana -= 10;
                        int reduction = 15 * 20 * defense / 100;
                        damage = 15 - reduction;
                    }
                    break;

                case 2:
                    if (mana < 5) {
                        System.out.println("Недостаточно маны, ход пропускается.");
                        isSkipped = true;
                    } else {
                        mana -= 5;
                        int reduction = 8 * 20 * defense / 100;
                        damage = 8 - reduction;
                    }
                    break;

                case 3:
                    if (mana < 20) {
                        System.out.println("Недостаточно маны, ход пропускается.");
                        isSkipped = true;
                    } else {
                        mana -= 20;
                        int reduction = 25 * 20 * defense / 100;
                        damage = 25 - reduction;
                    }
                    break;

                case 4:
                    mana += 15;
                    isSkipped = true;
                    break;

                default:
                    System.out.println("Неизвестное заклинание, ход пропускается.");
                    isSkipped = true;
                    break;
            }

            if (isSkipped) {
                skippedMoves++;
            } else {
                if (damage < 1) {
                    damage = 1;
                }
                health -= damage;

                if (defense == 3 && health < 70) {
                    defense = 2;
                } else if (defense == 2 && health < 40) {
                    defense = 1;
                } else if (defense == 1 && health < 10) {
                    defense = 0;
                }
            }

            if (health > 0) {System.out.printf("Прочность: %d, Мана: %d, Защита: %d%n", health, mana, defense);}
        }
        if (health <= 0) {System.out.println("Замок пал!");}
        System.out.printf("Ходов: %d%n", moves);
        System.out.printf("Пропущено: %d%n", skippedMoves);
        System.out.printf("Потеряно защиты: %d%n", initialDefense - defense);

        scanner.close();
    }
}