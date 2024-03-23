package org.example

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

/**
 * ShouldSpecを使ったテストの例
 *
 * contextを使ってテスト情報を追加する
 */
class ShouldSpecTest : ShouldSpec({
  // funspecと似ているtestの代わりにshouldを使う
  // NOTE: line7以下のcontextを使ったものにより、このメソッドは実行できなくなっている
  should("return the length of the string") {
    "sammy".length shouldBe 5
    "".length shouldBe 0
  }

  // NOTE: contextはいくらでもネストできる。テスト結果にもネストしたcontextは表示される
  context("check name length") {
    context("the last name") {
      context("of children") {
        should("should be 0-5") {
          "sammy".length shouldBe 5
          "".length shouldBe 0
        }
        should("return the length of the string") {
          "sammy".length shouldBe 5
          "".length shouldBe 0
        }
      }
    }
  }

  context("this outer block is enabled") {
    xshould("this test is disabled") {
      // test here
        10 - 5 shouldBe 5
    }
  }
  xcontext("this block is disabled") {
    should("disabled by inheritance from the parent") {
      // test here
      10 - 5 shouldBe 5
    }
  }
})
