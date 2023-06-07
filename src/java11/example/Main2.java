package java11.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 最初の出力
 * 1．Create → 選んだIndexにデータを入れる
 * 2．Read → データ1個を読み込んで画面に出力
 * 3．Update → 選んだIndexのデータを変更
 * 4．Delete → 選んだIndexのデータを削除
 * 5．全て出力 → データのリストを画面に出力
 *
 * 入力はキーボードから入力を貰う
 * 出力はConsoleでの出力にする
 *
 *
 * 1．Create
 * Indexを選択する
 * 有効なIndexならデータを入力データのタイプは文字列（String）
 * 無効なIndexならIndexを再入力
 * データの登録が成功すると最初の画面にもどる
 *
 * 2．Read
 * データが存在しなければ「データがないんです。」最初画面に戻る
 * データがあれば
 * 有効なIndexならデータを表示、最初画面に戻る
 * 無効なIndexならIndexを再入力
 *
 * 3．Update
 * データが存在しなければ「データがないんです。」最初画面に戻る
 * データがあれば
 * 有効なIndexならデータを変更、最初画面に戻る
 * 無効なIndexならIndexを再入力
 *
 * 4．Delete
 * データが存在しなければ「データがないんです。」最初画面に戻る
 * データがあれば
 * 有効なIndexならデータを削除、最初画面に戻る
 * 無効なIndexならIndexを再入力
 *
 * 5．List
 * 全てのデータを出力
 * 出力フォーマットは任せる
 *
 * 6．exit
 * */
public class Main2 {

    /**
     * あれは数字かどうかを判別するための正規表現
     * */
    private static final Pattern PATTERN_IS_INCLUDE = Pattern.compile("[1-6]");
    private static final Pattern PATTERN_IS_POSITIVE_INTEGER = Pattern.compile("\\d");

    // TODO singleton pattern
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRUDLogic(scanner);

        System.out.println("6が選ばれたのでプログラムを終了します");

    }
    private static void CRUDLogic(Scanner scanner) {
        List<String> result = new ArrayList<>();
        int menuId = getMenuId(scanner);
        while (IsNotExitMenuId(menuId)) {
            switch (menuId) {
                case 1:
                    printListIndexes(result);
                    create(scanner, result, getIndex(scanner, result));
                    break;

                case 2:
                case 3:
                case 4:
                    if (result.size() == 0) {
                        System.out.println("データがありません。Createを実行してください。");
                        break;
                    }

                    printListIndexes(result);

                    switch (menuId) {
                        case 2:
                            read(result, getIndex(scanner, result));
                            break;

                        case 3:
                            update(result, getIndex(scanner, result), scanner);
                            break;

                        case 4:
                            delete(result, getIndex(scanner, result));
                            break;
                    }
                    break;

                case 5:
                    printListValues(result);
                    break;
            }

            menuId = getMenuId(scanner);
        }
    }

    private static boolean IsNotExitMenuId(int menuId) {
        return menuId != 6;
    }

    private static void printListValues(List<String> result) {
        System.out.println("値を全て出力します。");
        for (String value : result){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void create(Scanner scanner, List<String> result, int searchIndex) {
        System.out.println("追加する文字列を入力してください");
        result.add(searchIndex, scanner.next());
    }

    private static void printListIndexes(List<String> result) {
        System.out.println("インデックスを選択してください。");
        for (int i = 0; i <= result.size(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //TODO　バリデーションに引っかかった場合は正しい値が入れられるまで繰り返す
    public static int getMenuId(Scanner scanner) {
        while (true) {
            printDefaultMessage();
            String menuId = scanner.next();
            if (!validateMenuId(menuId)) {
                System.out.println("Invalid value");
                continue;
            }

            return Integer.parseInt(menuId);
        }
    }

    private static boolean validateMenuId(String menuId) {
        if (!PATTERN_IS_INCLUDE.matcher(menuId).matches()) {
            return false;
        }

        return true;
    }


    //TODO バリデーションの追加、表示とバリデーションの機能を分ける
    private static void printDefaultMessage() {
        System.out.println("以下のメニューから選択してください。");
        System.out.println("1．Create");
        System.out.println("2．Read");
        System.out.println("3．Update");
        System.out.println("4．Delete");
        System.out.println("5．List");
        System.out.println("6．exit");
    }

    public static int getIndex(Scanner scanner, List<String> result) {
        while (true) {
            String stringListValue = scanner.next();
            if (!validateListValue(result, stringListValue)) {
                System.out.println("Invalid value");
                continue;
            }

            return Integer.parseInt(stringListValue);
        }
    }

    private static boolean validateListValue(List<String> result, String stringListValue) {
        if (!PATTERN_IS_POSITIVE_INTEGER.matcher(stringListValue).matches()) {
            return false;
        }

        int listValue = Integer.parseInt(stringListValue);
        if (validateListSize(result, listValue)) {
            return false;
        }

        return true;
    }

    private static boolean validateListSize(List<String> result, int menuID) {
        return result.size() < menuID || menuID < 0;
    }

    private static void read(List<String> result, int index) {
        System.out.println("入力されたインデックスの値を読み込みました。");
        System.out.println("値: " + result.get(index));
    }

    private static void update(List<String> result, int index, Scanner scanner) {
        System.out.println("合致するインデックスのデータの中身を上書きします");
        System.out.println("上書きする為の値を入力してください。");
        String updateValue = scanner.next();
        System.out.println("beforeUpdate :" + result.get(index));
        result.set(index,updateValue);
        System.out.println("afterUpdate :" + result.get(index));
    }

    private static void delete(List<String> result, int index) {
        System.out.println("対象インデックスの値を削除します。");
        result.remove(index);
    }

}