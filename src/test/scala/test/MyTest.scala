package test

import org.scalatest.{FlatSpec, Matchers}

class MyTest extends FlatSpec with Matchers {
  "a test" should "run" in {
    println("test is running")
    MyClass.test(1) shouldBe 8
    MyClass.test(2) shouldBe 9
    Thread.currentThread().getStackTrace.foreach{
      ste =>
        println(ste.toString)
    }
    println("het!")
  }
}
