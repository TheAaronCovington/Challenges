/*  DESCRIPTION:  A chessboard is an 8 x 8 grid of cells. Within each column and within each row, cells alternate
between black and white. The cell in the upper left corner (0, 0) is white. You are given a String[] board, where
the j-th character of the i-th element is 'F' if the cell in the j-th column from the left and i-th row from the top
is occupied, or '.' if it is empty. Return the number of occupied white cells on the board. 
*/
class WhiteCells{
	public int countOccupied(string[] board) {
            int count = 0;
            for (int i = 0; i < board.Length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < board[i].Length; j+= 2) {
                        if (board[i][j] != '.') {
                            count++;
                        }
                    }
                }
                else {
                    for (int j = 1; j < board[i].Length; j += 2) {
                        if (board[i][j] != '.') {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
}
