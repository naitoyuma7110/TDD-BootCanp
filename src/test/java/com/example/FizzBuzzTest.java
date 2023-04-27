package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayName("Fizz,Buzz,数列と変換規則を扱うFizzBuzzクラス")
public class FizzBuzzTest {
  private FizzBuzz fizzbuzz;

  // 各テスト共通の準備
  @BeforeEach
  void 事前準備() {
    System.out.println("事前準備");
    // 変数名の重複がない限りthisを省略する事で,自動でクラスフィールドを検索し解決してくれる
    fizzbuzz = new FizzBuzz();
  }

  @Nested
  class convertメソッドは数を文字列に変換する {
  
  @Nested
  class _3で割り切れる場合はFizzと変換 {
    @Test
    public void _3を渡すと文字列Fizzを返す() throws Exception {
      // 実行・検証
      assertEquals("Fizz", fizzbuzz.convert(3));
    }
  }
  
  @Nested
  class _5で割り切れる場合はFizzと変換 {
    @Test
    public void _5を渡すと文字列Buzzを返す() throws Exception {
      // 実行・検証
      assertEquals("Buzz", fizzbuzz.convert(5));
    }
  }
  
  @Nested
  class その他の数のときはそのまま文字列に変換する {
      
    @Test
    public void _1を渡すと文字列1を返す() throws Exception {
    // 実行・検証
    assertEquals( "1", fizzbuzz.convert(1));
    }
    
    @Test
    public void _2を渡すと文字列2を返す() throws Exception {
      // 実行・検証
      assertEquals("2", fizzbuzz.convert(2));
    }
  }
}
  
}
