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
