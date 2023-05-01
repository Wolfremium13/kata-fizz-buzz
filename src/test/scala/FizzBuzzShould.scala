package dev.wolfremium.kata

import org.scalatest.funspec.AnyFunSpec

class FizzBuzzShould extends AnyFunSpec {
  describe("determine what type it is") {
    it("ignoring non fizz buzz numbers") {
      assert(FizzBuzz().fromDigit(1) == "1")
      assert(FizzBuzz().fromDigit(7) == "7")
    }
    it("given a fizz number"){
      assert(FizzBuzz().fromDigit(3) == "Fizz")
    }
    it("given a buzz number"){
      assert(FizzBuzz().fromDigit(5) == "Buzz")
    }
  }
}
