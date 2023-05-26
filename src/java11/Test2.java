package java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



/**
 * 2つの入力を受け付ける
 * 入力値を比較し、昇順で並べる
 * 結果を出力
 * 数字以外の値を取得しようとしたらバリデーションに引っかかる。
 */
public class Test2 {

    // この正規表現は「正の整数」を扱う為のバリデーション
    private static final Pattern PATTERN = Pattern.compile("\\d+");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> getValues = new ArrayList<>();
        int getValOne, getValTwo;
        System.out.println("Enter the size of the array: ");
        while (true){
            getValOne = getInputValue(scanner);
            getValTwo = getInputValue(scanner);
            if (getValOne == 0 && getValTwo == 0){
                break;
            }

            //1つ目の値のほうが大きければ2番目に追加
            if (getValOne > getValTwo){
                getValues.add(getValTwo);
                getValues.add(getValOne);
            }else {
                getValues.add(getValOne);
                getValues.add(getValTwo);
            }
        }
        //TODO 出力
        printResult(getValues);

    }

    private static void printResult(List<Integer> getValues) {
        for (int i = 0; i < getValues.size(); i += 2) {
            System.out.println(getValues.get(i) + " " + getValues.get(i + 1));
        }
    }

    private static int getInputValue(Scanner scanner){
        int inputVal = 0;

        while(true) {
            try {
                String s = scanner.next();
                validate(s);
                inputVal = Integer.parseInt(s);
                break;

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        return inputVal;
    }

    private static void validate(String s){
        if (!PATTERN.matcher(s).matches()) {
            throw new IllegalArgumentException("Invalid input. Enter a positive integer: " + s);
        }
    }
}
