/*
 * DESCRIPTION: Chandu's girlfriend loves arrays that are sorted in non-increasing order. 
 * Today is her birthday. Chandu wants to give her some sorted arrays on her birthday. 
 * But the shop has only unsorted arrays. So, Chandu bought T unsorted arrays and is 
 * trying to sort them. But, he doesn't have much time to sort the arrays manually as 
 * he is getting late for the birthday party. So, he asked you to write a program to 
 * sort the T arrays in non-increasing order. Help him, or his girlfriend will kill him.
Input:
First line contains an integer T, denoting the number of test cases.
First line of each test case contains an integer N, denoting the size of the array.
Second line contains N space separated integers, denoting the array elements Ai.
Output:
For each test case, print the sorted array in non-increasing order.
Constraints:
1 <= T <= 100
1 <= N <= 105
0 <= Ai <= 109
Sample Input:
2
5
2 5 2 4 3
5
5 4 2 3 1
Sample Output
5 4 3 2 2
5 4 3 2 1
 */
import java.io.BufferedReader;//Had to use BufferedReader and StringBuilder to pass 3 test cases due to t/o's
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;
public class ChanduAndHisGF {
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(input.readLine()); //Read input and convert to int
		for(int i = 0; i < T; i++){
			int N = Integer.parseInt(input.readLine());
			Integer[] A = new Integer[N];
			String[] temp = input.readLine().split(" "); //Array holding a line of N integers
			for(int j = 0; j < N; j++){
				A[j] = Integer.parseInt(temp[j]); //Convert strings to integers and store in array
			}
			Arrays.sort(A, Collections.reverseOrder()); //Sort array in reverse order
			StringBuilder results = new StringBuilder(); //Use StringBuilder to construct output
			for(Integer x : A){
				results.append(x + " ");
			}
			System.out.println(results);//Print results
		}
	}
}
