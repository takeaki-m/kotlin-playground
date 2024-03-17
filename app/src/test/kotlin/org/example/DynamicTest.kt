package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

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