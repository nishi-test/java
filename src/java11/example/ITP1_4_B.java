package java11.example;

import java.util.Scanner;

public class ITP1_4_B {
    /**
     * 円の面積＝半径×半径×３.１４
     * 円周の長さ=円周の長さは直径×円周率
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circle = radius * radius * Math.PI;
        double diameter = (radius * 2) * Math.PI ;
        System.out.println(
                String.format("%.6f", circle) + " " + String.format("%.6f", diameter));
    }
}
