package abc.abc046

fun main(args: Array<String>) {
    val reader = System.`in`.bufferedReader()
    println(reader.readLine().split(" ").map(Integer::parseInt).toSet().size)
}