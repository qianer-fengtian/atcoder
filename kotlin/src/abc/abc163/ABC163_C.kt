package abc.abc163

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val map = mutableMapOf<Int, Int>()

    (1..n).forEach { map.computeIfAbsent(it) { 0 } }
    (2..n).forEach { map.computeIfPresent(sc.nextInt()) { k, v -> v+1 } }

    map.values.forEach(::println)
}