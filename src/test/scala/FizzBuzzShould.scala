package dev.wolfremium.kata

import org.scalatest.funspec.AnyFunSpec

class FizzBuzzShould extends AnyFunSpec {
  describe("determine what type it is") {
    it("ignoring non fizz buzz numbers") {
      assert(FizzBuzz().fromDigit(1) == "1")
      assert(FizzBuzz().fromDigit(7) == "7")
    }
    it("and ignore numbers above 100") {
      assert(FizzBuzz().fromDigit(101) == "")
    }
    it("given a fizz number") {
      assert(FizzBuzz().fromDigit(6) == "Fizz")
    }
    it("given a fizz fizz number") {
      assert(FizzBuzz().fromDigit(3) == "FizzFizz")
    }
    it("given a buzz number") {
      assert(FizzBuzz().fromDigit(10) == "Buzz")
    }
    it("given a buzz buzz number") {
      assert(FizzBuzz().fromDigit(5) == "BuzzBuzz")
    }
    it("given a fizz buzz number") {
      assert(FizzBuzz().fromDigit(60) == "FizzBuzz")
    }
    it("given a fizz fizz buzz number") {
      assert(FizzBuzz().fromDigit(30) == "FizzFizzBuzz")
    }
    it("given a fizz buzz buzz number") {
      assert(FizzBuzz().fromDigit(35) == "FizzBuzzBuzz")
      assert(FizzBuzz().fromDigit(45) == "FizzBuzzBuzz")
    }
  }
}
