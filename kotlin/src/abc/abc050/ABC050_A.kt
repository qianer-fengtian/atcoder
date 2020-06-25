package abc.abc050

fun main(args: Array<String>) {
    val (a, op, b) = readLine()!!.split(" ")
    println(when (op) {
        "+" -> a.toInt().plus(b.toInt())
        else-> a.toInt().minus(b.toInt())
    })
}