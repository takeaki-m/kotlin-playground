package org.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringSpecTest : StringSpec({
  "長野県の文字列は3文字である" {
    "長野県".length shouldBe 3
  }
  "東京都の文字列は3文字である".config(
    enabled = true, invocations = 3){
    "東京都".length shouldBe 3
  }
})