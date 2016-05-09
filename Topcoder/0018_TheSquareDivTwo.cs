/*  DESCRIPTION:  John and Brus like puzzles. They have been playing a new game which involves placing checkers
on a square board. The board is a grid containing the same number of columns and rows.
The game begins with John placing checkers on specific cells of the board. Then, R[i] is calculated for each row i,
where R[i] is the number of checkers in the i-th row. Brus must then move the checkers in such a way that for each
column i in the final board, the number of checkers in that column is equal to R[i]. Note that R[i] is calculated 
for the initial placement of checkers and is not modified afterwards. In a single turn, Brus can move a checker up, 
down, left or right into an adjacent empty cell. He may use as many turns as necessary to reach the goal.
You are given a String[] board, where the j-th character of the i-th element is uppercase 'C' if the cell at row i,
column j contains a checker and '.' otherwise. Return the final placement of checkers using the same format as the input.
Since there may be many possible final placements, return the one that comes first lexicographically.
*/
class TheSquareDivTwo{
		public string[] solve(string[] board) {
            char[,] matrix = new char[board.Length, board[0].Length];
            int[] R = new int[board.Length];
            string[] output = new string[board.Length];
            for (int i = 0; i < board.Length; i++) {
                for (int j = 0; j < board[i].Length; j++) {
                    matrix[i, j] = '.';
                    if (board[i][j] == 'C') {
                        R[i]++;
                    }
                }
            }
            for (int i = 0; i < board.Length; i++) {
                for (int j = 0; j < board.Length; j++) {
                    if (board.Length - R[i] - j <= 0) {
                        matrix[j, i] = 'C';
                    }
                }
            }
            for (int i = 0; i < board.Length; i++) {
                for (int j = 0; j < board[i].Length; j++) {
                    output[i] += matrix[i, j];
                }
            }
            return output;
        }
}
