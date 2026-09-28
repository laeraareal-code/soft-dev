package src.wbs;

import java.util.*;

public class wb1_2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String track = scanner.nextLine();
        double t = scanner.nextDouble();

        // 1st point
        int p1_space = track.indexOf(" ");
        int p1_semi = track.indexOf(";");
        int x1 = Integer.parseInt(track.substring(0, p1_space));
        int y1 = Integer.parseInt(track.substring(p1_space + 1, p1_semi));

        // 2nd point
        int p2_space = track.indexOf(" ", p1_semi);
        int p2_semi = track.indexOf(";", p1_semi + 1);
        int x2 = Integer.parseInt(track.substring(p1_semi + 1, p2_space));
        int y2 = Integer.parseInt(track.substring(p2_space + 1, p2_semi));

        // 3rd point
        int p3_space = track.indexOf(" ", p2_semi);
        int p3_semi = track.indexOf(";", p2_semi + 1);
        int x3 = Integer.parseInt(track.substring(p2_semi + 1, p3_space));
        int y3 = Integer.parseInt(track.substring(p3_space + 1, p3_semi));

        // 4th point
        int p4_space = track.indexOf(" ", p3_semi);
        int p4_semi = track.indexOf(";", p3_semi + 1);
        int x4 = Integer.parseInt(track.substring(p3_semi + 1, p4_space));
        int y4 = Integer.parseInt(track.substring(p4_space + 1, p4_semi));

        // 5th point
        int p5_space = track.indexOf(" ", p4_semi);
        int x5 = Integer.parseInt(track.substring(p4_semi + 1, p5_space));
        int y5 = Integer.parseInt(track.substring(p5_space + 1));

        // 1. Length
        double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double d4 = Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2));
        double totalLen = d1 + d2 + d3 + d4;

        // 2. Average speed
        double avgSpeed = totalLen / t;

        // 3. Direction
        int dx = x5 - x1;
        int dy = y5 - y1;

        String direction = (dx == 0 && dy == 0) ? "на месте" :
                (dx == 0) ? (dy > 0 ? "на север" : "на юг") :
                        (dy == 0) ? (dx > 0 ? "на восток" : "на запад") :
                                (dx > 0) ? (dy > 0 ? "на северо-восток" : "на юго-восток") :
                                        (dy > 0 ? "на северо-запад" : "на юго-запад");

        // Print
        System.out.printf(Locale.US, "Длина трека: %.2f%n", totalLen);
        System.out.printf(Locale.US, "Средняя скорость: %.2f%n", avgSpeed);
        System.out.printf("Направление: %s%n", direction);
    }
}
