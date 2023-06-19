package java11.example;


import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * N個の整数を入力し、最大値・最小値・合計値
 * 参照先：https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/all/ITP1_4_D
 * */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //入力回数
        int frequency = scanner.nextInt();
        //残った改行文字をエスケープするため(https://teratail.com/questions/106725)
        scanner.nextLine();
        //空白で区切られた数字
        String numberText = scanner.nextLine();
        //配列で持つ
        String[] numbersTextArray = numberText.split(" ");

        //Stringをintに変換
        int [] numbersArray = Stream.of(numbersTextArray).mapToInt(Integer::parseInt).toArray();
        int min, max, sum;
        min = getMinValue(numbersArray);
        max = getMaxValue(numbersArray);
        sum = getSum(numbersArray);
        System.out.println(min + " " + max + " " + sum);
    }

    private static int getMaxValue(int [] numbersArray){
        int maxValue = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            //マイナス値も許しているので初回だけ基準値として最初の値を入れる
            if (i == 0){
                maxValue = numbersArray[0];
            }
            if (maxValue < numbersArray[i]) {
                maxValue = numbersArray[i];
            }
        }
        return maxValue;
    }

    private static int getMinValue(int [] numbersArray){
        int maxValue = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            //マイナス値も許しているので初回だけ基準値として最初の値を入れる
            if (i == 0){
                maxValue = numbersArray[0];
            }
            if (maxValue > numbersArray[i]) {
                maxValue = numbersArray[i];
            }
        }
        return maxValue;
    }

    public static int getSum(int [] numbersArray){
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum = sum + numbersArray[i];
        }

        return sum;
    }
}
