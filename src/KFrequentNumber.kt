import java.util.*

class KFrequentNumber {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val freq = mutableMapOf<Int, Int>()

        for (num in nums) {
            freq[num] = (freq[num] ?: 0)+1
        }

        val minHeap = PriorityQueue<Int>(5) { k1, k2 ->
            freq[k1]!! - freq[k2]!!
        }


        minHeap.add(4)
        minHeap.add(3)
        minHeap.add(10)
        minHeap.add(6)

        minHeap.forEach {  }



        return freq.filter { entry ->
            entry.value >= k
        }.map {
            it.key
        }.toIntArray()
    }
}

fun main() {
    KFrequentNumber().topKFrequent(intArrayOf(1,1,1,1,2,2,3), 3).forEach { println(it) }
}