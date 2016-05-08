/*  DESCRIPTION:   Note: this problem statement contains images that may not display properly if viewed outside the applet.
You are to calculate the diagonal disproportion of a square matrix. The diagonal disproportion of a square matrix is the sum
of the elements of its main diagonal minus the sum of the elements of its collateral diagonal. The main and collateral diagonals 
of a square matrix are shown in figures 1 and 2 respectively. 
 The elements of the main diagonal are shown in green in figure 1, and the elements of the collateral diagonal are shown
 in cyan in figure 2.
Given a String[] matrix, return its diagonal disproportion. The j'th character of the i'th element of matrix should be 
treated as the element in the i'th row and j'th column of the matrix. 
*/
static int getDisproportion(string[] matrix) {
            int N = matrix[0].Length;
            int[,] grid = new int[N, N];
            int main = 0; int collateral = 0;
            for (int i = 0; i < matrix.Length; i++) {
                for (int j = 0; j < matrix[i].Length; j++) {
                    grid[i, j] = int.Parse(matrix[i][j] + "");
                }
            }
            int stepI = 0, stepJ = 0;
            while (stepI < matrix.Length && stepJ < matrix.Length) {
                main += grid[stepI, stepJ];
                stepI++; stepJ++;
            }
            stepI = 0; stepJ = N-1;
            while (stepI < matrix.Length && stepJ >= 0) {
                collateral += grid[stepI, stepJ];
                stepI++; stepJ--;
            }
            return main - collateral;
        }
