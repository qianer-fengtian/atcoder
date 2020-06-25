package abc.abc131

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val s = sc.next()

    for (x in 1 until s.length) {
        if (s[x] === s[x-1]) {
            println("Bad")
            return
        }
    }
    println("Good")
}

