package abc.abc047

fun main(args: Array<String>) {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine()

    var now = s[0].toString()
    var cnt = 0

    s.split("").filter(String::isNotBlank).forEach { i ->
        if (!now.equals(i)) {
            cnt++
            now = i
        }
    }

    println(cnt)
}
