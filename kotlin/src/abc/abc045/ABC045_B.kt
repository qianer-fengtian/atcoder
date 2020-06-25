package abc.abc045

fun main(args: Array<String>) {
    val map = mutableMapOf<Char, String>()
    map['a'] = readLine()!!
    map['b'] = readLine()!!
    map['c'] = readLine()!!

    var turn = map['a']!![0]
    map['a'] = map['a']!!.substring(1)

    while (true) {
        if (map[turn]!!.isEmpty()) {
            break
        }
        val oldTurn = turn
        turn = map[turn]!![0]
        map[oldTurn] = map[oldTurn]!!.substring(1)
    }

    println(turn.toUpperCase())
}