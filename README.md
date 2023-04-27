## 「見てわかるテスト駆動開発」を実践

参考：[TDD Boot Camp 2020 Online #1 基調講演/ライブコーディング(Youtube)](https://www.youtube.com/watch?v=Q-FJ3XmFlT8)

以下メモ

## テスト駆動開発の目的

> Clean code that works  
> 動作するきれいなコード

<img src="https://camo.qiitausercontent.com/c43dece9fcec0ca7d5e8805b91cd68c0cf67929d/68747470733a2f2f71696974612d696d6167652d73746f72652e73332e616d617a6f6e6177732e636f6d2f302f3230303133312f34613565663931302d666566352d613632312d373835632d6439336561393231396565372e706e67" width="400">

## TDD のサイクル

1. 目標を考える(Todo リスト)
2. 目標を示すテストを書く
3. そのテストを実行して失敗させる(Red)
   - コンパイルエラー
   - テストの失敗
4. 目的のコードを書く
5. 2 のテストを成功させる(Green)
6. テストが通るままでリファクタリングを行う(Refactor)
7. 1-6 を繰り返す

<img src="https://camo.qiitausercontent.com/e7734e96edb5a574c34c38464035cf61c664f365/68747470733a2f2f71696974612d696d6167652d73746f72652e73332e616d617a6f6e6177732e636f6d2f302f3230303133312f30376635336137642d356237302d386438302d303862342d3762663839303834366433312e706e67" width="400">

- テスト容易性と重要度
  重要度と容易性は必ずしも比例しない

- リファクタリングとは

  従来の定義:  
  外部から見た振る舞いが変わらないまま、内部のコードを書き換える

  TDD において:  
  成功しているテストが成功しているままでプロダクトコードとテストコードを書き換える  
  ->「振る舞いの変化」というあいまいな部分を「テストの成功」という明確な基準に置き換えた

## FizzBuzz で TDD の実践

→ どのようにテストを設計するか？
  「仕様をテストに落とし込む」「テストコードと仕様を一致させる」

## テストコードの構成

1. 準備(given)
2. 実行(when)
3. 検証(then)

> テスト駆動開発はゴール(重要なこと)から書く  
> 検証 -> 実行 -> 準備

## テストは動作するドキュメント

1. 検証から書く
   検証される期待値は具体的な値である必要がある  
   → あいまいな定義,認識では手が止まる  
    この認識の甘さに,より早く遭遇した方が良い(遅いほどロスが大きい)

2. 実行を書く  
   **_作成より先に使用する_**  
   作っていないクラス、メソッドを使う → 使いやすさ >>> 作りやすさ

   - 作りやすさを優先し,使い勝手が悪い実装を防ぐ
   - 使い手側が関知する必要のない作り手側の事情は含ませない

3. 準備をする
   _テスト間に依存関係は回避する！_  
   例）A テストで準備した内容を B テストで呼び込むみ利用するなど

## テストコードのバグはどうやって調べるの？

×「テストのテストを書くの？」

○*ディフェクトインサーション：テストに意図的に判別可能な誤りを入れる*

テストをわざと失敗させ,その結果からテストの整合性を判断する  
(意図的にグリーンをレッドにする)  
## 仮実装

*特定の値で*テストをグリーンにする(_仮実装_)

Q. テストを崩してもコストがかからないタイミングはどこか？  
A. コンパイルを通し仮実装を行いとりあえずテストを通した段階  

→ _テストコードのバグ検証は仮実装の段階で行う_

## 三角測量

テストがたまたま通過したということが起こらないよう２つ以上の値を使用しテストを書く。  
_アサーションルーレット：assert を複数並べる方法は NG パターン(どの検証が失敗したか判別するのにコストを要す)_

仮実装の段階では,特定の値しかテストをパスしないため三角測量によるテストは失敗する

## TDD サイクルの実際

- _最初のサイクル_  
  設計の比重が大きい.テストをテストしやすい(ディフェクトインサーション)段階  
  その代わり,実装が未熟でリファクタリングを要する

- _不安と自信の度合に応じて歩幅を調整する_

  - テスト -> 仮実装 -> 三角測量 -> 実装
  - テスト -> 仮実装 -> 実装
  - テスト -> 明白な実装

- _重複に対するリファクタリング_

  - Product の重複をリファクタリングする
    3 つ目の重複で修正(3out)  
    2 つ目の重複で修正(2out)

- _テスト構造とリファクタリング_
  - 余分なテストは余分なメンテナンスコストを要する
  - 作成者の都合によるテスト構造の見直し
  - 余分なテストの削除
