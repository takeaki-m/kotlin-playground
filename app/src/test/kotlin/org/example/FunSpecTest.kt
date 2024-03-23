package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

/**
 * FunSpecを使ったテストの例
 *
 * 一番シンプルな形だと思う
 */
class FunSpecTest : FunSpec({
  test("sample test") {
    1 + 2 shouldBe 3
  }

  test ("String length should return the lenght of the string") {
    "sammy".length shouldBe 5
    "".length shouldBe 0
  }

  test ("名前は6文字である") {
    "samsam".length shouldBe 6
  }
})
