class ArrayExercise {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        board.forEachIndexed { row, chars ->
            chars.forEachIndexed { col, char ->
                if (char == word[0]) {
                    if (searchWord(board, row, col, word, 0)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    // row = 1, col = 3 , wi = 0
    private fun searchWord(board: Array<CharArray>, row: Int, col: Int, word: String, wi: Int ): Boolean {
        if (wi == word.length) return true
        if (row < 0 || col < 0 || row > board.size - 1 || col > board[0].size - 1 ) return false

        if (word[wi] != board[row][col]) return false

        val tmp = board[row][col]
        board[row][col] = '*'

        val left = col - 1 // 2
        val right = col + 1 // 4
        val top = row - 1 // 0
        val bottom = row + 1 // 2

        val wii = wi + 1
        val isFound = searchWord(board, row, left, word, wii)
                || searchWord(board, row, right, word, wii)
                || searchWord(board, top, col, word, wii)
                || searchWord(board, bottom, col, word, wii)
        board[row][col] = tmp
        return isFound
    }


}

val matrix = arrayOf(
   charArrayOf('A','B','C','E'),
    charArrayOf('S','F','C','S'),
    charArrayOf('A','D','E','E')
)

fun main() {

}

