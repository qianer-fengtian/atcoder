package abc.abc131

fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map(String::toLong)

    println((b-(a-1)) - (b/c-(a-1)/c) - (b/d-(a-1)/d) + b/lcm(c, d)-(a-1)/lcm(c, d))
}

fun lcm(a: Long, b: Long): Long {
    return a * b / gcd(a, b)
}

fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}