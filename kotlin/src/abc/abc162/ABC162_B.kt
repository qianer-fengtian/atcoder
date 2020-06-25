package abc.abc162

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val ans = (1..n).filter { it % 3 != 0 && it % 5 != 0 }.sumByDouble(Int::toDouble).toLong()
    println(ans)
}