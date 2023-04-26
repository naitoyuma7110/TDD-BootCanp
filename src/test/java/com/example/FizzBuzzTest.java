package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void _1を渡すと文字列1を返す() throws Exception {
    // 準備
    FizzBuzz fizzbuzz = new FizzBuzz();
    // 実行
    String actual = fizzbuzz.convert(1);
    // 検証
    assertEquals("失敗しました", "1", actual);

  }
  
}
