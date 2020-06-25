package abc.abc156

import java.util.*
import kotlin.math.floor

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()!!
    val b = sc.nextInt()!!

    (1..1000).forEach { i ->
        if (a.toDouble().equals(floor(i * 0.08)) && b.toDouble().equals(floor(i * 0.1))) {
            println(i)
            return
        }
    }

    println(-1)
}