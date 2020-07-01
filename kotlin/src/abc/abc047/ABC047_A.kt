package abc.abc047

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(Integer::valueOf)

    if (a+b === c || a+c === b || b+c === a) {
        println("Yes")
    } else {
        println("No")
    }
}
