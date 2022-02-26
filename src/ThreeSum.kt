class ThreeSum {

    // 0 0 0 0 0
    // +
    //     j
    //       k

    fun threeSum(nums: IntArray): List<List<Int>> {

        if (nums.size == 0) return emptyList()
        if (nums.size == 1) return emptyList()

        val results = HashSet<List<Int>>()
        nums.sort()
        for (i in 0 until nums.size) {

            var j = i + 1
            var k = nums.size - 1

            while ( j < k ) {
                val sum =  nums[j] + nums[k] + nums[i]
                if (sum > 0) {
                    k--
                } else if (sum < 0) {
                    j++
                } else {
                    results.add(listOf(nums[i], nums[j], nums[k]))
                    k--
                    j++
                }

            }
        }

        return results.toList()

    }
}


œ

    val matrix = List(5) {
        MutableList(5) {
            0
        }
    }

    matrix[0][1] = 1

    val list = HashSet<List<Int>>()

    list.add(listOf(2, 3))
    list.add(listOf(2, 3))

    println(list)

   // println(ThreeSum().threeSum(intArrayOf(0, 0, 0, 0, 0)))

    /**
     *
    1,2,3,4
    0,0,7,8
    0,10,11,12
    13,14,15,0


    0,0,3,0
    0,0,0,0
    0,0,0,0
    0,0,0,0

    0,1,2,0
    3,4,5,2
    1,3,1,5

    0,0,0,0
    0,4,5,0
    0,3,1,0
**/
}
