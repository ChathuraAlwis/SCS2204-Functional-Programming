class Rational (x: Int, y: Int){

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def numer = x / gcd(x,y)
    def denom = y / gcd(x,y)

    def neg = new Rational(-this.numer, this.denom)
    def substract(r: Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)

    override def toString(): String = "" + numer + "/" + denom
}

class Account(n: Int, b: Double) {

    val accountNumber: Int = n
    var balance: Double = b

    override def toString = "[" + accountNumber + ":" + balance + "]"

    def withdraw(a:Double) = this.balance-=a
    def deposit(a:Double) = this.balance+=a
    def transfer(a:Account, b:Double): Unit = {
        this.withdraw(b)
        a.deposit(b)
    }
}

class Bank(b: List[Account]){

    def bank: List[Account] = b

    def find(n: Int) = b.filter(x => x.accountNumber.equals(n))

    def overdraft = b.filter(x => x.balance < 0)

    def balance = b.map(x => (x, x.balance)).reduce((a, c) => ( c._1 , a._2 + c._2))

    def interest = b.map( 
        x => {
            x.balance match {
                case a if a >= 0 => x.deposit(x.balance * 0.05)
                case _ => x withdraw Math.abs(x.balance) * 0.01

            }
        x
    })
}

object main extends App{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    
    val ans = x.substract(y).substract(z)
    println(ans)

    val a = new Account(1,100000)
    val b = new Account(2,-50000)
    a.transfer(b,5000)

    println(a, b)

    val bank = new Bank(List(a,b))

    println(bank.find(1))
    println(bank.overdraft)
    println(bank.balance)
    println(bank.interest)
}
