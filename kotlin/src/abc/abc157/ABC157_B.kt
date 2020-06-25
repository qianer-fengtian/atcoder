package abc.abc157

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val a = Array(3) { Array(3) { it -> sc.nextInt() } }

    val n = sc.nextInt()

    for (i in 0 until n) {
        val b = sc.nextInt()
        for (j in 0 until 3) {
            for (k in 0 until 3) {
                if (a[j][k] == b) a[j][k] = 0
            }
        }
    }

    var bingo = false
    if (a[0][0] == a[0][1] && a[0][1] == a[0][2]) bingo = true
    if (a[1][0] == a[1][1] && a[1][1] == a[1][2]) bingo = true
    if (a[2][0] == a[2][1] && a[2][1] == a[2][2]) bingo = true
    if (a[0][0] == a[1][0] && a[1][0] == a[2][0]) bingo = true
    if (a[0][1] == a[1][1] && a[1][1] == a[2][1]) bingo = true
    if (a[0][2] == a[1][2] && a[1][2] == a[2][2]) bingo = true
    if (a[0][0] == a[1][1] && a[1][1] == a[2][2]) bingo = true
    if (a[2][0] == a[1][1] && a[1][1] == a[0][2]) bingo = true

    if (bingo) {
        println("Yes")
    } else {
        println("No")
    }
}