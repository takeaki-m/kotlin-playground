package org.example

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

/**
 * FreeSpecの実行例
 *
 * Free Formatで作成できる分、人によりブレが出て堅牢性が下がるかもしれない
 */
class FreeSpecTest : FreeSpec({
  // - is used for create a new container and show the hierarchy
  "String.length" - {
    "should return the length of the String" {
      "sammy".length shouldBe 5
      "".length shouldBe 0
    }
  }
  "containers can be nested as deep as you want" - {
    "and so we nest another container" - {
      "yet another container" - {
        "finally a real test" {
          1 + 1 shouldBe 2
        }
      }
    }
  }
})
