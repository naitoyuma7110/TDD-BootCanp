## 「見てわかるテスト駆動開発」を実践

参考：[TDD Boot Camp 2020 Online #1 基調講演/ライブコーディング(Youtube)](https://www.youtube.com/watch?v=Q-FJ3XmFlT8)

以下メモ

## テスト開発駆動の目的
> Clean code that works  
> 動作するきれいなコード

## TDD のサイクル

1. 目標を考える(Todo リスト)
2. 目標を示すテストを書く
3. そのテストを実行して失敗させる(Red)
4. 目的のコードを書く
5. 2 のテストを成功させる(Green)
6. テストが通るままでリファクタリングを行う(Refactor)
7. 1-6 を繰り返す

- テスト容易性と重要度
  重要度と容易性は必ずしも比例しない

- リファクタリングとは
  ファウラー:  
  外部から見た振る舞いが変わらないまま、内部のコードを書き換える

  TDD において:  
  成功しているテストが成功しているままでプロダクトコードとテストコードを書き換える  
  ->「振る舞いの変化」というあいまいな部分を「テストの成功」という明確な基準に置き換えた

## FizzBuzz で TDD の実践

→ どのようにテストを設計するか？
Test.md でテスト設計の練習
