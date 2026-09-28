package src.wbs;

import java.util.*;

public class wb1_6
{
    static void main(String[] args)
    {
        java.util.Locale.setDefault(java.util.Locale.US);

        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        int sharp1 = code.indexOf('#');
        int sharp2 = code.indexOf('#', sharp1 + 1);
        int sharp3 = code.indexOf('#', sharp2 + 1);

        String hex = code.substring(0, sharp1);
        String bin = code.substring(sharp1 + 1, sharp2);
        String oct = code.substring(sharp2 + 1, sharp3);
        String cha = code.substring(sharp3 + 1, sharp3 + 2);

        int hex10 = Integer.parseInt(hex, 16);
        int bin10 = Integer.parseInt(bin, 2);
        int oct10 = Integer.parseInt(oct, 8);

        int sum = hex10 + bin10 + oct10;
        byte bSum = (byte) sum;
        short sSum = (short) sum;

        int iSum = bSum;
        long lSum = iSum;
        float fSum = lSum;
        double dSum = fSum;

        int iCha = cha.charAt(0);
        String uCha = cha.toUpperCase();
        String lCha = cha.toLowerCase();
        boolean isNum = cha.matches("\\d+");

        String sum2 = Integer.toBinaryString(sum);
        String sum8 = Integer.toOctalString(sum);
        String sum16 = Integer.toHexString(sum);

        System.out.printf("Сумма: %d%n", sum);
        System.out.printf("Как byte: %d %d%n", bSum, sum - bSum);
        System.out.printf("Как short: %d %d%n", sSum, sum - sSum);
        System.out.printf("Цепочка: %d → %d → %d → %.1f → %.1f%n", bSum, iSum, lSum, fSum, dSum);
        System.out.printf("Символ: %s %d %s %s %b%n", cha, iCha, uCha, lCha, isNum);
        System.out.printf("Двоичное: %s%n", sum2);
        System.out.printf("Восьмеричное: %s%n", sum8);
        System.out.printf("Шестнадцатеричное: %s%n", sum16);
        System.out.printf("MAX_VALUE + 1: %d%n", (Integer.MAX_VALUE + 1));
        System.out.println(sum + 10);
        System.out.println(sum * 2);
        System.out.println(sum % 7);
        System.out.println(sum + 1_000_000);
    }
}
