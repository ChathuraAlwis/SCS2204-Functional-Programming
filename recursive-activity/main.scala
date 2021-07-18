object  questions{
  //Q1 -> prime(n) return true if n is prime else false
  def prime(n:Int, i:Int = 2) : Boolean = {
    if (n <= 2) 
      return {if (n == 2) true else false};
    if (n%i == 0) return false;
    if(i*i > n) return true;
    return prime(n, i+1)
  }

  //Q2 -> primeSeq(n) print prime numbers upto n
  def primeSeq(n:Int):Unit = {
    if (n<=1) return ()
    primeSeq(n-1)
    if (prime(n)) print(n + " ")
  }

  //Q3 -> sum(n) print sum of first n natural numbers
  def sum(n:Int, total:Int = 0):Unit = {
    if (n<=0) return print(total)
    sum(n-1, total+n)
  }

  //Q4 -> isEven(n) returns true if n is even else false
  def isEven(n:Int):Boolean = {
    if (n==0) return true;
    if (n==1) return false;
    if (n<0) isEven(-n)
    return isEven(n-2)
  }

  //Q5 -> evenSum(n) returns sum of even numbers upto n
  def evenSum(n:Int, total:Int = 0):Int = {
    if (n<=1) return total;
    return evenSum(n-1, total + {if (isEven(n)) n else 0})
  }

  //Q6 -> fib(n) print first n terms of the fibonacci series
  def fib(n:Int, f:Int = 0, s:Int = 1):Unit = {
    if (n<=0) return ()
    print(f + " ")
    fib(n-1, s, s+f)
  }

}

object Main extends App {
  //Q1
  println("Q1: " + questions.prime(31))
  //Q2
  print("Q2: ")
  questions.primeSeq(10)
  println()
  //Q3
  print("Q3: ")
  questions.sum(5)
  println()
  //Q4
  println("Q4: " + questions.isEven(78))
  //Q5
  println("Q5: " + questions.evenSum(10))
  //Q6
  print("Q6: ")
  questions.fib(10)
  println()
}
