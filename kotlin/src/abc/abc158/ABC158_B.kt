package abc.abc158

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()

    var total = n / (a+b) * a
    if (n % (a+b) != 0L) total += Math.min(n % (a+b), a)

    println(total)
}