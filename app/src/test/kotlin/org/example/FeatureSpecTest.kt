package org.example

import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe

class FeatureSpecTest : FeatureSpec({
  fun calculate(numberList: List<Int>): Int {
    return numberList.sum()
  }
  // このブロックが実行できない理由がわからない
  // Error Message
  // calculate numbers is excluded by test filter(s): Excluded by test path filter: 'check even '
  feature("calculate numbers") {
    scenario("three positive numbers 1,2,3 given") {
      calculate(listOf(1, 2, 3)).shouldBe(6)
    }
    scenario("three positive numbers 1,2,3  and one negative number -1") {
      calculate(listOf(1, 2, 3, -1)).shouldBe(5)
    }
    xscenario("this block is disabled") {
      calculate(listOf(1, 2, 3, -1, 5)).shouldBe(10)
    }
  }

  // こちらのブロックは実行される
  feature("check even ") {
    scenario("even number 2") {
      2 % 2 shouldBe 0
    }
    scenario("even number 137") {
      137 % 2 shouldBe 1
    }
    xscenario("this block is disabled") {
      10 % 2 shouldBe 0
    }
  }

  xfeature("this block is disabled") {
    scenario("even number 137") {
      137 % 2 shouldBe 1
    }
  }
})
