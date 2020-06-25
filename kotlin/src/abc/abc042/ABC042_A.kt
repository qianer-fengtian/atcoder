package abc.abc042

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    var ok = false
    if (a == 7 && b == 5 && c == 5) ok = true
    if (a == 5 && b == 7 && c == 5) ok = true
    if (a == 5 && b == 5 && c == 7) ok = true

    if (ok) {
        println("YES")
    } else {
        println("NO")
    }
}