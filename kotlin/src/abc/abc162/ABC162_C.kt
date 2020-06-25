package abc.abc162

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val k = sc.nextInt()

    val ans = (1..k).map { a -> (1..k).map { b -> (1..k).map { c -> gcd(a, gcd(b, c)) }.sum() }.sum() }.sum()
    println(ans)
}

fun gcd(a: Int, b: Int) : Int {
    return if (b == 0)  a else gcd(b, a % b)
}
