package abc.abc046

fun main(args: Array<String>) {
    val reader = System.`in`.bufferedReader();
    val (n, k) = reader.readLine().split(" ").map(String::toDouble)
    println((k * Math.pow(k-1, n-1)).toInt())
}