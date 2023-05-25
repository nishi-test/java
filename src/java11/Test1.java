package java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test1 {
    // この正規表現は「正の整数」を扱う為のバリデーション
    private static final Pattern PATTERN = Pattern.compile("\\d+");

    public static void main(String[] args) {
        // todo Javaの標準入出力
        Scanner scanner = new Scanner(System.in);
        int input;
        //配列は固定長なのとcase用の数字が必要なので
        // todo to LIST
        List<Integer> inputList = new ArrayList<>();
        // todo do-while vs. while
        while(true) {
            System.out.println("Enter the size of the array: ");
            input = getPositiveInteger(scanner);
            // todo study break, continue
            if (input == 0) {
                break;
            }

            inputList.add(input);
        }

        printResult(inputList);

        scanner.close();
    }

    //値の取得
    private static int getPositiveInteger(Scanner scanner) {
        //文字以外のバリデーション
        int result;
        while(true) {
            try {
                String input = scanner.next();
                validate(input);
                result = Integer.parseInt(input);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return result;
    }

    //バリデーション
    private static void validate(String input) {
        if (!PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException("Invalid input. Enter a positive integer: " + input);
        }
    }

    //結果出力
    public static void printResult(List<Integer> inputList){
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println("Case " + (i+1) + ": " + inputList.get(i));
            System.out.println("-----");
        }
    }
}

