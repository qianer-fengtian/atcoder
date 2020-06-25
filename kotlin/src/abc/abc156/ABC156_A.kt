package abc.abc156

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val r = sc.nextDouble()
    val rating = if (n >= 10) r else r + 100 * (10 - n)
    println(rating.toInt())
}