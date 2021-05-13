object Assignment1{
    //Q1
    def CelToFahr(C:Int):Double={
        return C*1.8 + 32
    }

    //Q2
    def VolofSphere(R:Int):Double={
        var pi=3.14159265359
        return 4/3 * pi * Math.pow(R,3)
    }

    //Q3
    def WholeSaleCost(n:Int):Double={
        var init = n * 24.95 * 40/100 + 3
        if(n>50){
            return init + (n-50)*0.75
        }
        return init
    }

    //driverFunction
    def main(args: Array[String]):Unit={
        println(CelToFahr(35))
        println(VolofSphere(5))
        println(WholeSaleCost(60))
    }
}