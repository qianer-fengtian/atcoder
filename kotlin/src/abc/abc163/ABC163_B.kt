package abc.abc163

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val a = mutableListOf<Int>()
    (0 until m).forEach {
        a.add(sc.nextInt())
    }

    if (n >= a.sum()) {
        println(n - a.sum())
    } else {
        println(-1)
    }
}