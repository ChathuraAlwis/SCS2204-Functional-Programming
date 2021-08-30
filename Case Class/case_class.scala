package case_class

case class Point(x: Int, y: Int){

    //Q1
    def +(that: Point) = Point(this.x + that.x, this.y + that.y)

    //Q2
    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    //Q3
    def distance(that: Point) = {
        Math.sqrt(((this.x - that.x) * (this.x - that.x)) + ((this.y - that.y) * (this.y - that.y)))
    }

    //Q4
    def invert() = Point(y,x)

    override def toString = "(" + x + "," + y + ")"

}