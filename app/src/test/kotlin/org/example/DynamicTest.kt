package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

/**
 * Kotestのなかで動的にテストを生成する例
 *
 * itを利用して値を動的に渡すことができる
 *
 */
class DynamicTest : FunSpec({
  listOf(
    "sam",
    "pam",
    "tim",
  ).forEach{
    test("$it should be a three letter name" ) {
      it.shouldHaveLength(3)
    }
  }
})
