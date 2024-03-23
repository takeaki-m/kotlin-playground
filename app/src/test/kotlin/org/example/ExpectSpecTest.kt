package org.example

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

/**
 * ExpectSpecを使ったテストの例
 *
 * Kotest originalの模様
 */
class ExpectSpecTest : ExpectSpec({
  context("a calculator") {
    expect("simple addition") {
      1 + 2 shouldBe 3
    }
  }
  context("throw exception") {
    expect("thorw althmatic exception") {
      shouldThrow<ArithmeticException> {
        // throw arithmetic exception
        1 / 0
      }
    }
  }
})
