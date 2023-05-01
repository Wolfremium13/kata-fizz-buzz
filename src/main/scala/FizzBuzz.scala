package dev.wolfremium.kata

import math.Integral.Implicits.infixIntegralOps

class FizzBuzz:
  def fromDigit(number: Int): String =
    if number % 15 == 0 then return "FizzBuzz"
    if number % 3 == 0 then return "Fizz"
    if number % 5 == 0 then return "Buzz"
    number.toString

