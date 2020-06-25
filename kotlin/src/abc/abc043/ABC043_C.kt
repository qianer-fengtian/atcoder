package abc.abc043

fun main(args: Array<String>) {
    readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)
    val x = Math.round(a.average())
    println(a.map { i -> Math.pow((i - x).toDouble(), 2.0) }.sum().toInt())
}