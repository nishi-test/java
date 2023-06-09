## Java学習のロードマップ
※ 参照 → [ロードマップ](https://qiita.com/abeno/items/1aecfad3dc8c340c442e)  

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

###
1. DNS (Domain Name System)  
- 概要  
ネットワーク上の機器に割り当てられた名称（ドメイン名やIPアドレス）を管理するシステムのことです。
インターネット上で接続先の機器を探しだす際には、機器の名称であるIPアドレスまたはドメイン名が必要となります。  
DNSには人間にとって使いやすいドメイン名と、コンピュータが理解できるIPアドレスを関連づけ、通信相手の機器を探し出す役割があります。
- 役割  
DNSサーバーのおもな役割は、ドメイン名とIPアドレスの関連付けと、ユーザーによるIPアドレスの問い合わせ対応の2つ
※ユーザーが指定したドメイン名から対応するIPアドレスを探し出し、Webサーバーにアクセスできるようにしている
※ 参照　→[DNSとは](https://x-tech.pasona.co.jp/media/detail.html?p=9379#:~:text=DNS%E3%81%A8%E3%81%AFDomain%20Name,%E5%90%8D%E3%81%8C%E5%BF%85%E8%A6%81%E3%81%A8%E3%81%AA%E3%82%8A%E3%81%BE%E3%81%99%E3%80%82)  
2. Route53  
- 概要  
アマゾンのDNSサービス。  
Amazon Route 53 で管理しているドメインを参照し、レコード(IP アドレスなど)に紐づくデータを取得することができる。  
※ 参照　→[Route53について](https://qiita.com/leomaro7/items/75151348409b936f52e0)  
- 役割  
①ドメイン登録機能  
  ドメイン名を、Amazon Route 53 に登録することで、Amazon Route 53 で "sunnycloud.jp" のドメインを管理・運用することが可能.  
②DNS ルーティング機能  
  ウェブサイトにアクセスするには、ブラウザのアドレスバーに、ドメイン名 "sunnycloud.jp" または  
  サブドメイン名  "www.sunnycloud.jp" を入力することで、Amazon Route 53 がブラウザに対して、  
  アクセスしたドメインに紐づく情報の受け渡しを行い、ウェブサイトの表示またはウェブアプリケーションに接続するための支援を行う。
③DNS ヘルスチェック機能  
  Amazon Route 53 の DNS ヘルスチェック機能では、ウェブサーバーなどのリソースの正常性を監視することができます。  
  必要に応じて、ヘルスチェックに失敗した際に、Amazon CloudWatch アラームの通知を受ける設定も可能です。  
  この機能により、DNS エンドポイントのリソースが非正常な状態であることに気づくことも Amazon Route 53 でできるため、  
  何か問題があった際のダウンタイムを削減することが可能です。

3. CDN (Contents Delivery Networks)
- 概要  
クライアントとサーバーの間に入って、サーバーが正常に稼働する為に、クライアントからくる沢山の要求等をサーバーの代わりに処理してあげるためのもの。  
地理的に分散配置された複数のキャッシュサーバーによって構成されています。CDNは単一のサーバーのことではなく、複数のサーバーによってネットワーク化されたサービスのことを表します。
- 役割  
①表示の高速化  
自分の近くにあるWebサーバからホームページのファイルを持ってくるようになるので、表示が速くなります。  
②負荷分散  
サーバーへの負荷の肩代わり。クライアントに代わってコンテンツをサーバーに要求し、それをCDNが受け取るとキャッシュ（コピー）して保持する。  
このキャッシュをクライアントからの要求の際に渡す事で、サーバーへのアクセスを無くしてサーバーへの負荷を減らす。
4. CloudFront
5. ALB (Application Load Balancer)
6. ASG (Auto Scaling Group)
7. EC2 Instance
8. RDS
9. Cache

## テスティングフレームワーク:単体テストを実施するためのフレームワーク
※ 参照 → [JUnitとは](https://camp.trainocate.co.jp/magazine/whats-junit/)  
※ 基本的な単体テストをこれを利用して時間短縮する。複雑なものはちゃんとテストしてあげればいい。あるテストをする為にはそれまでの処理をすべて経由しなければならないが,これはテストしたいコードに対して直接確認ができる。  
例）注文完了のテストをするために、本来であれば注文情報入力→確認までしないとテストできないがこれを直接テストできる。

## TDD(テスト駆動開発)
[JUnit](https://www.seplus.jp/dokushuzemi/blog/2020/09/entry_junit.html)  
[テスト駆動開発（TDD）とは？](https://www.qbook.jp/column/713.html)  
[スタブ、モック、フェイク、ダミー](https://craftsman-software.com/posts/38)

## インメモリデータベースとは
※ 参照 →[インメモリデータベースのメリット・デメリット](https://products.sint.co.jp/siob/blog/in-memory-databases#toc-0)
- メモリ（主記憶装置）上でデータを管理するデータベースです。
- ハードディスクやSSD（補助記憶装置）上にデータを保管する従来のデータベースよりも高速にデータの読み書きが出来るのが特徴です。  
- コンピューターの電源がオフになると保存されているデータが消失する。  (DRAMの特徴)
- 電源が消失した際にデータを復旧する機能を備え、データを永続化している。  
- スナップショットとトランザクションログの組み合わせで永続性を保証  
- スナップショット:データベースのある時点での状態をチェックポイントファイルとして保存すること。  
- トランザクションログ：トランザクションが完了したとき、データベースに変更が加わったときディスクに保存する。(スナップショットを取得したタイミングでクリアされる)  
- 例）サーバーの電源が落ちた際には、スナップショットを用いてある時点までのデータベースの状態を復元し、その後スナップショット取得以降のトランザクションログをもとに再度データベースを変更することでデータ復旧を行う。
※近年では電源が切れても保存したデータが消失しない不揮発性メモリに対応したインメモリデータベースが登場していて、こちらのほうが上と比べて復旧が早い  

## AWS関連
- Redis（Amazon ElastiCache（キャッシュ管理・操作））
- ロードバランサー
- ステートフル(stateful)とステートレス(stateless)  
ステートフル:前回のデータを保存して、データ保存した内容を処理結果に反映される仕組みのことです。  
ステートレス:前回のデータを保存しないで、前回のデータを内容に処理結果に反映させない仕組みのことです。  
- ログインセッションの保持とデータベースとサーバ間に配置してキャッシュとして活かす。

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
- Bigdecimal：小数の桁数が大きくなりすぎるとdouble型では誤差が大きくなるのでBigdecimalを使うのが良い。（doubleは10進数では約 15 桁までが正確）
### アクセス修飾子：public,private,protect,なし
- public:全てのクラスからアクセス
- private:現在のクラスからだけアクセスできる
- protect:現在のクラスとサブクラスからアクセスできる
- なし：現在のクラスと同じパッケージのクラスからアクセスできる

- サービスプロバイダーインターフェース
- インターフェース
- ORM
- JPA Hibernate
- Dependency Injection
- package : ディレクトリのこと
- import :外部packageのclassやInterFaceにアクセスする為の宣言でインスタンス生成やメソッドの利用を可能にする
- static import
- メンバ：クラスに宣言されたフィールド とメソッドのこと
- メンバ変数：定義したクラスのオブジェクトを作成した際の性質や状態を保管しておくために定義
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
   このメソッドの呼び出し元に処理を任せる。つまり呼び出し元でtry-catchをしなければならない。していないとプログラムがコンパイルエラーになる.
#### 7.springの概念
[spring](https://o7planning.org/11257/use-multiple-viewresolvers-in-spring-boot)
#### キャメルケース


#### 再生順に関して
・曲ごとの優先を画面上で設定させる（入れることができる値は制限する）
・Java側で受け取った優先順位の設定があるものだけ先にリストにセットし残りをランダムにする。
（未判定は「0」デフォルト値を0で設定し、設定したいものだけ設定する）
・再生順が1巡目との重複を避けるために前回の再生順番を保持しておき、順番が重複されなくなるまでランダムな並び替えを繰り返す。


#### 補足
Arrays.equals(a, b)で配列同士の順番が同じか比較できる
例）
int[] a = {85, 78, 92};
int[] b = {85, 78, 92, 80};

System.out.println(Arrays.equals(a, b));  // false


Song[] peekQueue()；
1曲再生されるごとに対象の曲がズレていく。
例　
曲の数10曲として
1→2→3→4→5
1が再生終わったタイミングで2→3→4→5→6のようにずれていく



#### ①モック・スタブ
- テストしたい処理があるとして、実際のロジックに直接テストのコードを書くわけにはいかないので、
テスト用の仮のデータを用意してそこに値をつめて処理に問題ないことを確認すること。
（実際のテストではサーバが立ち上がっていないからエラーになるなど
プログラム以外の問題で失敗することがあるが、これはいつ試しても同じ結果が返ってくるので、
そういった依存関係の影響を受けずテストすることができる）

#### ②http method
- 対象となるリソースに対して「何をしたいか」を指示する。  
- ※ブラウザの制約上、実際に使用されるのは、 GET 、 POST の2種類  

#### ③リクエストライン・リクエストヘッダ・リクエストボディ
- HTTPリクエストを構成する部品。  
リクエストライン：何をどうしたいのか書かれている。
例）POST /search.html HTTP/1.1\r\n　なら「/search.html」に「HTTP/1.1」で「POST」するぞ！という意味。

- リクエストヘッダ:WebブラウザさんからWebサーバさんに伝えたい情報。  
主に、お願いごとやお願い元に関するあれやこれやの情報が書きこまれます。
【フィールド名】:【内容】の形式で記述する

- リクエストボディ：HTTPリクエストメッセージボディは補足のメモ書きスペースみたいなものです。  
必要に応じて補足情報的なことが適当な形式で書かれています。
例えばPOST通信の場合は、受け渡されるパラメータの内容が、ここに記述されます。
GET通信のように補足の必要がない場合は、特に何も書かれません。

#### ④Lombok
- 読みは、「ロンボック」もしくは「ロンボク」。  
Lombok とは Lombok は、アノテーションによってセッターやゲッター、コンストラクターなどのクラスの機能を自動生成するためのライブラリです。
クラス上からこれらの記述が見えなくなるのでコードが見やすくなる。
コンパイル時に自動生成される

#### [ランダムの操作](https://qiita.com/found/items/e3541b9363989fd2c8de)

## [⑤builderパターン](https://qiita.com/takutotacos/items/33cfda205ab30a43b0b1)
[その２](http://www.code-magagine.com/?p=2674)

### [DDD関係](https://qiita.com/tbpgr/items/3ef00dfad76bfe077902#:~:text=Given%2FWhen%2FThen%20%E3%81%AF%20BDD,%E3%83%A1%E3%83%AA%E3%83%83%E3%83%88%E3%81%A8%E8%80%83%E3%81%88%E3%82%89%E3%82%8C%E3%81%BE%E3%81%99%E3%80%82)  
### [httpステータスコード](https://www.itmanage.co.jp/column/http-www-request-response-statuscode/)  

build.gradle
// https://mvnrepository.com/artifact/org.apache.commons/commons-jcs-core
implementation 'org.apache.commons:commons-jcs-core:2.2.1'

comparable？Javaには文字や数字を比較するためのものがあるのでそれを実装すれば入力が数字でなくともＯＫ

given-when-then:

・再生リスト一覧画面
・優先度設定（項目なのか画面なのか）
・数字以外を許可しないように設定
