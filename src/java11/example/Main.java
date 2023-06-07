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
public class Main {

    public static final Pattern PATTERN = Pattern.compile("\\d");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        printDefaultMessage();
        int menuId = getMenuValue(scanner);

        CRUDLogic(scanner, result, menuId);
        System.out.println("6が選ばれたのでプログラムを終了します");

    }
    private static void CRUDLogic(Scanner scanner, List<String> result, int menuId) {
        while (menuId != 6) {
            if (menuId == 1) {
                System.out.println("インデックスを選択してください。");
                for (int i = 0; i <= result.size(); i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                int searchIndex = getListValue(scanner, result);
                System.out.println("追加する文字列を入力してください");
                String addValue = scanner.next();
                result.add(searchIndex,addValue);
                printDefaultMessage();
                menuId = getMenuValue(scanner);

            } else if (menuId == 2 || menuId == 3 || menuId == 4) {
                if (result.size() == 0) {
                    System.out.println("データがありません。Createを実行してください。");
                }else {
                    System.out.println("有効なインデックスを入力してください。");
                    for (int i = 0; i < result.size(); i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    int searchIndex = getListValue(scanner, result);
                    //Read　or Update or Delete
                    readOrUpdateOrDeleteExecute(result, menuId, searchIndex, scanner);
                }
                printDefaultMessage();
                menuId = getMenuValue(scanner);
            } else if (menuId == 5) {
                System.out.println("値を全て出力します。");
                for (String value : result){
                    System.out.print(value + " ");
                }
                System.out.println();
                printDefaultMessage();
                menuId = getMenuValue(scanner);
            }
        }
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
    //TODO　バリデーションに引っかかった場合は正しい値が入れられるまで繰り返す
    //
    public static int getMenuValue(Scanner scanner) {
        int returnMenuID;
        while (true){
            String stringMenuID = scanner.next();
            if (!PATTERN.matcher(stringMenuID).matches()) {
                System.out.println("文字の入力は許可されていません");
                continue;
            }
            int menuID = Integer.parseInt(stringMenuID);
            if (menuID > 6 || menuID <= 0) {
                System.out.println("存在するメニューの中から選んでいません。再入力下さい。");
            }else {
                returnMenuID = menuID;
                break;
            }
        }
        return returnMenuID;
    }

    public static int getListValue(Scanner scanner, List<String> result) {
        int returnListValue;
        while (true){
            String stringListValue = scanner.next();
            if (!PATTERN.matcher(stringListValue).matches()) {
                System.out.println("文字の入力は許可されていません");
                continue;
            }
            int menuID = Integer.parseInt(stringListValue);
            if (result.size() < menuID || menuID < 0) {
                System.out.println("対象外のインデックスです。再度入力してください。");
            }else {
                returnListValue = menuID;
                break;
            }
        }
        return returnListValue;
    }


    private static void readOrUpdateOrDeleteExecute(List<String> result, int menuId, int searchIndex,Scanner scanner){
        if (menuId == 2){
            System.out.println("入力されたインデックスの値を読み込みました。");
            System.out.println("値: " + result.get(searchIndex));
        } else if (menuId == 3) {
            System.out.println("合致するインデックスのデータの中身を上書きします");
            System.out.println("上書きする為の値を入力してください。");
            String updateValue = scanner.next();
            System.out.println("beforeUpdate :" + result.get(searchIndex));
            result.set(searchIndex,updateValue);
            System.out.println("afterUpdate :" + result.get(searchIndex));
        }else {
            System.out.println("対象インデックスの値を削除します。");
            result.remove(searchIndex);
        }
    }
}