package dev.wolfremium.kata

import math.Integral.Implicits.infixIntegralOps

class FizzBuzz:
  def fromDigit(number: Number): String =
    if number.intValue() % 3 == 0 then return "Fizz"
    if number.intValue() % 5 == 0 then return "Buzz"
    number.toString

