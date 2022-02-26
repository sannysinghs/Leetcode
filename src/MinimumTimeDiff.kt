import kotlin.math.abs

class MinimumTimeDiff {
    fun findMinDifference(timePoints: List<String>): Int {
        val ti = IntArray(timePoints.size)
        for (i in timePoints.indices) {
            ti[i] = timeToInt(timePoints[i])
        }

        ti.sort()

        var min = 24 * 60 - abs(ti.first() - ti.last())
        for (i in ti.size - 1 downTo 1) {
            min = Math.min(min, ti[i] - ti[i-1])
        }

        return min

    }

    fun timeToInt (t: String): Int {
        val (minute, sec) = t.split(":")
        return minute.toInt() * 60 + sec.toInt()
    }

}

fun main() {

    println(MinimumTimeDiff().findMinDifference(listOf("23:59", "21:00", "21:50" )))

}