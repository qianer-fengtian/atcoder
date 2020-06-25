package abc.abc044

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    println(x * Math.min(n, k) + y * Math.max(0, n-k))
}
