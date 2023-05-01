package dev.wolfremium.kata

import math.Integral.Implicits.infixIntegralOps

class FizzBuzz:
  def fromDigit(number: Int): String =
    val isFizzBuzz = number % 15 == 0
    val isFizz = number % 3 == 0
    val isBuzz = number % 5 == 0
    val isFizzFizz = isFizz && number.toString.contains("3")
    if isFizzFizz then return "FizzFizz"
    if isFizzBuzz then return "FizzBuzz"
    if isFizz then return "Fizz"
    if isBuzz then return "Buzz"
    number.toString

