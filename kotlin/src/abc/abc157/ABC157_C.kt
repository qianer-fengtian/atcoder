package abc.abc157

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val s = mutableMapOf<Int, Int>()
    (0 until m).forEach {
        val a = sc.nextInt()
        val b = sc.nextInt()
        if (s[a] != null && b != s[a]) {
            println(-1)
            return
        }
        s[a] = b
    }

    (0 until 1000).forEach { i ->
        val str = i.toString()
        if (str.length !=n) return@forEach

        var ok = true
        for ((t, u) in s.entries) {
            if (str.length < t) return@forEach
            if (str[t-1] != u.toString()[0]) {
                ok = false
            }
        }

        if (ok) {
            println(i)
            return
        }
    }
    println(-1)
}