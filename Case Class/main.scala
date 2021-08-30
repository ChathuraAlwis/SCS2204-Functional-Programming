import case_class.Point

object main extends App{

    val p1 = Point(5, 15)
    val p2 = Point(6, 26)
    val p3 = p1 + p2
    val p4 = p1.move(2, 2)
    val p5 = p1.invert()
    val D = p1.distance(p2)

    println("" + p1 + " + " + p2 + " = " + p3)
    println("Moving " + p1 + " by (2, 2) = " + p4)
    println("Distance between " + p1 + " and " + p2 + " = " + D)
    println("Invert of " + p1 + " = " + p5)

}

    