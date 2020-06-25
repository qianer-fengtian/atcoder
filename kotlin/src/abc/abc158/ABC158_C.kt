package abc.abc158

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in 1..1000) {
        val c = Math.floor(i * 0.08).toInt()
        val d = Math.floor(i * 0.10).toInt()
        if (a == c && b == d) {
            println(i)
            return
        }
    }
    println(-1)
}