package dev.wolfremium.kata

import math.Integral.Implicits.infixIntegralOps

class FizzBuzz:
  def fromDigit(number: Int): String =
    val isFizzBuzz = number % 15 == 0
    val isFizz = number % 3 == 0
    val isBuzz = number % 5 == 0
    val containsThree = number.toString.contains("3")
    val isFizzFizz = isFizz && containsThree
    val containsFive = number.toString.contains("5")
    val isBuzzBuzz = isBuzz && containsFive
    val isFizzFizzBuzz = isFizz && containsThree && isBuzz
    val isFizzBuzzBuzz = isBuzz && containsFive && containsThree
    if isFizzBuzzBuzz then return "FizzBuzzBuzz"
    if isFizzFizzBuzz then return "FizzFizzBuzz"
    if isFizzBuzz then return "FizzBuzz"
    if isFizzFizz then return "FizzFizz"
    if isBuzzBuzz then return "BuzzBuzz"
    if isFizz then return "Fizz"
    if isBuzz then return "Buzz"
    number.toString

