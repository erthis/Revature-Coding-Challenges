


object WeeklyQuestions {
  {
    def sortThree(num1: Int, num2: Int, num3: Int): Int = {
      var z = Array(num1, num2, num3).sorted
      return z(1)
    }


    def sumNumbersInString(firstString: String): Int = {
      var digitString = firstString.filter(_.isDigit)
      var A = new Array[Int](3);
      for (i <- 0 to A.length - 1) {
        A(i) = digitString(i).asDigit
      }
      return A.sum
    }

  }
}

