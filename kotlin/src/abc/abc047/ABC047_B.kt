package abc.abc047

import java.lang.Exception

fun main(args: Array<String>) {
    val reader = System.`in`.bufferedReader()

    val (w, h, n) = reader.readLine().split(" ").map(Integer::parseInt)

    val area = (0 until h).map { (0 until w).map { 1 }.toMutableList() }.toList()

    (1..n).forEach {
        val (x, y, a) = reader.readLine().split(" ").map(Integer::parseInt)

        when(a) {
            1 -> paint(area, 0, x, 0, h)
            2 -> paint(area, x, w, 0, h)
            3 -> paint(area, 0, w, 0, y)
            4 -> paint(area, 0, w, y, h)
            else -> throw Exception()
        }
    }

    println(area.map { it.sum() }.toList().sum())
}

fun paint(area: List<MutableList<Int>>, sw: Int, ew: Int, sh: Int, eh: Int) {
    (sh until eh).forEach { i -> (sw until ew).forEach { j -> area[i][j] = 0 } }
}