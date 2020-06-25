package abc.abc050

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(" ").map(String::toInt)
    val m = readLine()!!.toInt()

    (1..m).forEach {
        val (p, x) = readLine()!!.split(" ").map(String::toInt)
        println(t.sum() - t[p-1] + x)
    }
}