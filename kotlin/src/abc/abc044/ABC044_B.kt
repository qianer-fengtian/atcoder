package abc.abc044

fun main(args: Array<String>) {
    val w = readLine()!!

    val m = mutableMapOf<String, Int>()
    w.forEach {
        val key = it.toString()
        if (m[key] == null) m[key] = 0
        m[key]?.plus(1)?.let { i -> m[key] = i }
    }

    if (m.values.filter { it % 2 != 0 }.isEmpty()) {
        println("Yes")
    } else {
        println("No")
    }
}
