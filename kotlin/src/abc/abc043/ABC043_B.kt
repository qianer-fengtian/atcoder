package abc.abc043

fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = ""

    s.forEach { c ->
        when(c) {
            '0' -> ans += '0'
            '1' -> ans += '1'
            'B' -> ans = ans.slice(0 until ans.length-1)
        }
    }

    println(ans)
}