
fun main() {
    var v = my3dvector(1.0 ,2.0 ,3.0)
    var v1=my3dvector(3.0,  4.0, 2.0)
    println(v.getscaraluri(v1))
    println(v.getvectoruli(v1))
}

class my3dvector(var x:Double,var y:Double, var z:Double ) {


    fun getscaraluri(xd:my3dvector): Double {
        return x*xd.x+y*xd.y+z*xd.z
    }

    fun getvectoruli(xd:my3dvector): String {
        return "(${y*xd.z-z*xd.y};${z*xd.x-x*xd.z};${x*xd.y-y*xd.y})"

    }
}