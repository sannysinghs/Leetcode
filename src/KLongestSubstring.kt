import kotlin.math.max

class KLongestSubstring {
    private val freq = IntArray(26)

    fun longestSubstring(s: String, k: Int): Int {
        s.toCharArray().forEach { freq[it - 'a']++ }
        return getLength(s, 0, s.length - 1, k)
    }

    private fun getLength(s: String, l: Int, r: Int, k: Int): Int {
        if (r < k) return 0
        s. { index, c ->
            freq[c - 'a'] < k
        }

        val badIndex =
        if (badIndex < 0) {
            return r - l
        }
        return max(getLength(s, l, badIndex - 1, k), getLength(s, badIndex + 1, r, k))
    }
}

fun main() {
    println(KLongestSubstring().longestSubstring("abbcabb", 2))
}