## オンラインジャッジ
※ 参照 → [オンラインジャッジの問題集](https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/all)  
## 質問系（ソースのレビューもしてくれる）
※ 参照 → [ChatGPT(人工知能チャットボット)](https://chat.openai.com/?model=text-davinci-002-render-sha)  
※ 勉強の流れ：オンラインジャッジの問題を自分なりに実装→ ChatGPTにコードレビューをしてもらう→修正→またレビュー（以降無限ループ）
## マークダウン記法
※ 参照 → [Qiita マークダウン記法 一覧表・チートシート](https://qiita.com/kamorits/items/6f342da395ad57468ae3)  

例）
<ul>
<li></li>
</ul>

1. a
2. b

<ol>
<li></li>
</ol>

### h3
#### h4
##### h5
###### h6

~~~ 言語(例：Java)
この例であればJavaコードを記載する

~~~
## Gitをブログみたいにしてくれるやつ：jekyll  
※ 参照 → [Jekyll を使用して GitHub Pages サイトを作成する](https://docs.github.com/ja/pages/setting-up-a-github-pages-site-with-jekyll/creating-a-github-pages-site-with-jekyll)
## コミットメッセージのルール
※ 参照 →[僕が考える最強のコミットメッセージの書き方](https://qiita.com/konatsu_p/items/dfe199ebe3a7d2010b3e)  
- メッセージのポイント
1. Prefixをつける  
2. 理由を書く  
3. 日本語 or 英語？
- Prefixの一覧
1. feat: 新しい機能 
2. fix: バグの修正 
3. docs: ドキュメントのみの変更 
4. style: 空白、フォーマット、セミコロン追加など 
5. refactor: 仕様に影響がないコード改善(リファクタ)
6. perf: パフォーマンス向上関連 
7. test: テスト関連 
8. chore: ビルド、補助ツール、ライブラリ関連

## Javaの用語説明
- static final : 可変オブジェクトに設定するのは注意。上書きできる。（処理の重さに応じて使い分ける）
- クラス：設計図
- インスタンス：設計図を基に作られた実体で（生成時に設定された値を持っている）newすると作られるやつ
- heap：インスタンスが生成されるとこの領域に値を保持する。（参照型であれは変数の実際の値が入っている）
- stack:基本型（primitive）は値を保持、参照型（reference）は値を保有しているheap領域の住所を持っている。
- final：stack領域の値の変更を禁止すること。しかし参照型はヒープ領域に値が存在するため
  参照型の可変オブジェクトであれば変更可能。
- 不変オブジェクト：値が変わること自体を禁止する性質があり、一度設定されたらもう変更できないが、
  もとのインスタンスを利用して別のインスタンスとして保存することは可能。
- コンストラクタ：クラスのインスタンスを生成する時に自動的に実行されるメソッド 
- Listなどのコレクションは参照型なので、int -> Intgerみたいな基本型から参照型に変換するみたいなことをするときは、
  配列を使ったほうが良い。※特別な理由がない限り配列を使ったほうが良い
- コードの可読性（わかりやすい変数名-機能毎にメソッドを作る）
- while は繰り返しの回数が決まっていない時によく使う。
- for は繰り返しの回数が決まっている時によく使う。
- 連想配列　＝ Map

- static final：自由に変更できる変数に対して、一度代入したら変更できない（＝再代入できない）定数を作る。
  定数であることはfinal修飾子だけで表現できますが、static修飾子を付けるのがお作法です。static修飾子を付与することで、
  インスタンス生成のたびに同じ値をインスタンスにコピーするのを防ぐことができます。（メモリを抑えるというメリットがあります。）

- break文：最も内側の1つのループから抜け出します。※多重ループの外側まで抜ける場合は、ラベル付きbreak文を使います。
- continue文：後の処理をスキップして元のループ文の先頭に戻り、次のループ処理に移るときに使います。
- 正規表現  
参照 → [Javaで文字列が数値かどうかを確認する](https://www.baeldung.com/java-check-string-number)  
参照 → [Java正規表現の動作確認ができるサイト](https://regex-testdrive.com/ja/dotest)

### while文とdo while文の違い。
1. 共通しているのは、条件を満たしているときだけ繰り返しの処理を行うこと。
2. 違いはwhileは条件式が最初に来ているので条件を満たさなければ処理を一度も実行しないことがあり得るが、
     do whileは条件式が処理の後に来ている関係で処理が一度は必ず実行される。

### 配列とリストの違い
1. 要素の扱い：配列は要素数が固定、リストは可変
2. データの持ち方：配列ははじめにメモリ上の連続した領域を確保し、リストは新しい要素が追加されるたびにメモリの領域を確保する
3. データ操作：配列は一度作ってしまうと要素数の増減は不可だが入れ替えは可能。リストは要素数の増減やデータの挿入、入れ替えが容易

### Array(配列)の特徴：
1. 同じ型のものしか扱えない
2. 同じ性質の値だけを入れる(※特徴というよりそうしたほうがプログラムの可読性が上がるため)
3. 配列の長さは変えられない
4. すべての要素が隙間なく連続的に並んでいる 
   ※ただし別の配列を用意して拡張することは可能（Arrayの拡張方法：arraycopyメソッド）

### コレクション（List, Set, Map）の特徴を抑える。Stack, Queue, Dequeue, PrimaryQueue
1. ArrayList：要素が順序をもった配列として実装されている。要素は指定した位置または最後の位置に挿入可能。
　　　　　　 順序番号を持っているので要素の取り出しは高速
2. LinkedList：要素番号を持っていないが要素同士が繋がった情報を持つ
3. Set：重複した要素を含むことができない。
4. List：順序付けられたコレクションである。重複した要素を含むことができる。ユーザーは要素を挿入する場所やインデックスによって要素にアクセスすることを正確に制御できる。
5. Queue：追加の挿入、抽出、および検査が追加されたコレクション。処理する前の複数の要素を保持するために使われる。
  基本的なCollectionオペレーションに加えて，追加の挿入や抽出や検査のオペレーションを供給する。
6. Deque：Queueと同じ機能を持つ。加えて，FIFO（先入先出）やLIFO（後入先出）の両方のために使われる。
7. Map：キーと値を紐付け（マップ）したオブジェクトである。重複したキーを含まない。各々のキーは多くてもひとつの値に紐付けられている。

### 例外処理
#### 1. Throwable  
Throwableは、Javaの例外処理の階層構造で、すべてのエラーと例外の基本クラスです。Throwableクラスは、Javaプログラムで発生する可能性のある例外やエラーを表すために使用されます。サブクラスとしてErrorクラスとExceptionクラスをもつ。

- getMessage(): 例外の詳細なエラーメッセージを取得します。
- printStackTrace() → 例外のスタックトレースを出力します。スタックトレースには、例外が発生した箇所のメソッド呼び出しの履歴が含まれます。
- その他の例外処理に関連するメソッド   
→ getCause()、initCause()、fillInStackTrace()など、例外処理や例外チェーンの操作に使用される。  
- ※全ての例外がこのクラスを継承しているからそのエラーを取得したりすることができる。

#### 2. Error 
- 発生した時点でプログラムが止まるのでキャッチしても意味がない。根本的な問題が発生している可能性があるので対応は必要。
- 例）OutOfMemoryError, IllegalAccessError, StackOverflowError

#### 3. Exception（チェック例外（checked exception））
- チェック済み例外は、Exceptionクラスのサブクラスであり、コンパイル時に例外処理が強制されます。
- メソッドがチェック済み例外をスローする場合、そのメソッドのシグネチャにthrowsキーワードを使用して、その例外が処理されるか、呼び出し元に転送されることを示す必要があります。
- 例外処理を実施しないか、適切なハンドリング（try-catch, throws）がされない場合、コンパイルエラーが発生します。（実行した時点ですぐ気付けるのはメリット）
- 例）IOException, SQLException

#### 4. RuntimeException（非チェック例外（unchecked exception）） 
非チェック例外は、RuntimeExceptionクラスとそのサブクラス。主にプログラミングエラーに起因するものであり、実行時に発生する可能性がある。  
コンパイル時に例外処理が強制されない。 メソッドが非チェック例外をスローする場合でも、それをキャッチするかどうかはコンパイラによってチェックされません。  
例） NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException

#### 5. try-catch  
起きたエラーを処理する事。
#### 6. throws
   このメソッドの呼び出し元に処理を任せる。つまり呼び出し元でtry-catchをしなければならない。していないとプログラムがコンパイルエラーになる。