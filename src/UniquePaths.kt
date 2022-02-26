class UniquePaths {

    fun uniquePaths(m: Int, n: Int): Int {


        if (m == 0 || n == 0) return 0
        if (m == 1 && n == 1) return 1

        val left = 0
        val top = 0


        val matrix = List(m) {
            MutableList(n) {
                0
            }
        }

        return findPath(m, n, matrix, top, left)

    }

    fun findPath(m: Int, n: Int, matrix: List<MutableList<Int>>, row: Int, col: Int): Int {

        if (row > m - 1 || col > n - 1) return 0
        if (matrix[row][col] == 1) return 0
        if (row == m - 1 && col == n -1) return 1

        matrix[row][col] = 1

        return findPath(m, n, matrix, row, col + 1) + findPath(m, n, matrix, row + 1, col)

    }
}

fun main() {
    println(UniquePaths().uniquePaths(51, 9))
}