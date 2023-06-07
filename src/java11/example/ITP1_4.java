package java11.example;

import java.util.Scanner;

/**
 *２つの整数 a と b を読み込んで、以下の値を計算するプログラムを作成して下さい：
 *
 * a ÷ b ： d (整数)
 * a ÷ b の余り ： r (整数)
 * a ÷ b ： f (浮動小数点数)
 *
 * (https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/all/ITP1_4_A)
 */
public class ITP1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValueOne = scanner.nextInt();
        int inputValueTwo = scanner.nextInt();
        DivisionResult divisionResult = new DivisionResult();
        division(divisionResult, inputValueOne, inputValueTwo);
        printResult(divisionResult);
    }

    private static DivisionResult division(DivisionResult divisionResult, int inputValueOne, int inputValueTwo){

        double divisionDecimalPoint = (double) inputValueOne / inputValueTwo;
        divisionResult.setQuotient(inputValueOne / inputValueTwo);
        divisionResult.setRemainder(inputValueOne % inputValueTwo);
        divisionResult.setQuotientDecimal(divisionDecimalPoint);

        return divisionResult;
    }

    private static void printResult(DivisionResult divisionResult){
        System.out.println(divisionResult.getQuotient() + " " + divisionResult.getRemainder() + " " + String.format("%.5f", divisionResult.getQuotientDecimal()));
    }
}
