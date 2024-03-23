package org.example

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeEven
import io.kotest.matchers.ints.shouldBeZero
import io.kotest.matchers.shouldBe

class BehaviorSpecTest : BehaviorSpec({
  Given("所持金は500円") {
    When("200円のお菓子を購入") {
      Then("手元には300円残る") {
        (500 - 200).shouldBe(300)
      }
    }
    When("500円のお菓子を購入") {
      Then("手元には0円残る") {
        (500 - 500).shouldBeZero()
      }
    }
    When("600円のお菓子を購入") {
      Then("購入できない") {
        (500 - 600).shouldBeEven()
      }
    }
   and("アルバイトで5000円もらった") {
      When("映画館で1000円使う") {
        Then("所持金は5700円") {
          (500 + 5000 + 1000 - 1000 - 300 - 500 - 300).shouldBe(4400)
        }
      }
    }
  }
  // Nesting
  // at `Then` block, you can use `and`
  // nesting を使いすぎると見通しが悪くなる
  // Using too much nesting can make the code hard to read
  Given("所持金は最初0円") {
    and("アルバイトで5000円もらった") {
      and("お小遣いで2000円もらった") {
        and("宝くじに当選して1000円当選した") {
          When("映画館で1000円使う") {
            and("お菓子を300円買う") {
              and("電車で500円使う") {
                and("バスで300円使う") {
                  Then("所持金は5700円") {
                    (500 + 5000 + 1000 - 1000 - 300 - 500 - 300).shouldBe(4400)
                  }
                }
              }
            }
          }
        }
      }
    }
  }
})