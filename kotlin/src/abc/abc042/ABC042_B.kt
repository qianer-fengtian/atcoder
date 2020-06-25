package abc.abc042

fun main(args: Array<String>) {
    val (n, l) = readLine()!!.split(" ").map(String::toInt)
    val s = (0 until n).map { readLine()!! }.toList()
    println(s.sorted().joinToString(""))
}