package org.example

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class WordSpecTest: WordSpec({
  // to add another level of nesting, `When` kyeword is used
  "Hello" When {
    "asked for length" should {
      "return 5" {
        "hello".length shouldBe 5
      }
    }
    "append to Bob" should {
      "return Hello Bob" {
        "Hello" + " Bob" shouldBe "Hello Bob"
      }
    }
    "String.length" should {
      "return the length of the string" {
        "sammy".length shouldBe 5
        "".length shouldBe 0
      }
    }
  }
})