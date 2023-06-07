/*
package java11.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ITP1_4_C {
    //オペランド正規表現
    private static final Pattern OPERATORPATTERN = Pattern.compile("[\\+\\-\\*\\/]");
    public static void main(String[] args) {
        System.out.println("整数・演算子・整数の順番で入力してください。");
        Scanner scanner = new Scanner(System.in);
        */
/*try{
            //入力(整数値)
            int integerOne = scanner.nextInt();
            //演算子を文字列として格納;
            String operator = scanner.next();
            //入力(整数値)
            int integerTwo = scanner.nextInt();
        }catch (IllegalArgumentException e) {
            System.out.println("意図しない型の入力があります");
        }*//*

        //空白含む式を格納
        String formula = scanner.nextLine();
        //空白で分割
        String[] formulaSplit = formula.split(" ");
        List<String> print = new ArrayList<>();
        //最初の入力を保存
        // TODO
        print.add(formula);
        while (!"?".equals(formulaSplit[1])) {
            //空白含む式を格納
            formula = scanner.nextLine();
            print.add();
        }
        printResult(reOperator, reIntegerOne, reIntegerTwo);
        System.out.println("?が入力されたので処理を終了");

    }
    private static void printResult(String operator, int integerOne, int integerTwo){
        if("+".equals(operator)){
            System.out.println(integerOne + integerTwo);
        } else if ("-".equals(operator)) {
            System.out.println(integerOne - integerTwo);
        } else if ("*".equals(operator)) {
            System.out.println(integerOne * integerTwo);
        } else if ("/".equals(operator)) {
            System.out.println(integerOne / integerTwo);
        } else {

        }
    }
}
*/
