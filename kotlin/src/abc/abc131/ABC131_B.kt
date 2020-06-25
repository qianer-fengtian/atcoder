package abc.abc131

fun main(args: Array<String>) {
    val (n, l) = readLine()!!.split(" ").map(String::toInt)
    val list = (1..n).map { l + it - 1 }.toList()
    val absMin = list.map(Math::abs).min()!!
    val relMin = if (list.min()!! > 0) absMin else -absMin
    println(list.sum() - relMin)
}