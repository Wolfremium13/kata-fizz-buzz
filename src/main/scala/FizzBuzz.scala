package dev.wolfremium.kata

import math.Integral.Implicits.infixIntegralOps

class FizzBuzz:
  def fromDigit(number: Number): String =
    if number.intValue() % 3 == 0 then "Fizz" else number.toString

