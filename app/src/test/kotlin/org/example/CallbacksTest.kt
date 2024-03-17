package org.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldHaveLength

class CallbacksTest : FunSpec ({
  beforeEach {
    println("Hello from $it")
  }

  test ("sam should be a three letter name") {
    "sam".shouldHaveLength(3)
  }

  afterEach {
    println("Goodbye from $it")
  }

})