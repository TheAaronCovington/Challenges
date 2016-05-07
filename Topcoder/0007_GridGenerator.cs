/*  DESCRIPTION:  Consider the following grid of numbers:
 1 0  3  4   1
 4 5  8  15  20
 1 10 23 46  81
 0 11 44 113 240
 3 14 69 226 579
Aside from the top row and left column, each number is equal to the sum of the three numbers immediately left, above,
and above-left of it. You will be given a int[], row, representing the first row of a similar grid, and a int[], col,
representing the first column of the grid. Your task is to return the value of the lower rightmost location when the
values are calculated in the same way. Hence, the above example would be represented by the input row = {1,0,3,4,1},
col = {1,4,1,0,3}.
*/
class GridGenerator{
	public int generate(int[] row, int[] col) {
            int N = col.Length;
            int[,] grid = new int[N, N];
            for (int i = 0; i < col.Length; i++) {
                grid[i,0] = col[i];
                grid[0, i] = row[i];
            }
            for (int i = 1; i < col.Length; i++) {
                for (int j = 1; j < row.Length; j++) {
                    grid[i, j] = grid[i-1, j] + grid[i, j-1] + grid[i-1, j-1];
                }
            }
            return grid[row.Length-1, col.Length-1];
        }
}
