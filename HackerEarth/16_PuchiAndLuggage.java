/* DESCRIPTION:  Puchi hates to carry luggage, but unfortunately he got a job to carry the 
luggage of his N friends in office. Each day, one of his N friends, gives him the luggage
of a particular weight to carry. You will be given the weight of luggage of each friend in
the array Weight, where Weighti is the weight of luggage of ith friend carried by Puchi on 
ith day. It is given that all the luggages carried by Puchi are distinct in their weights.
As Prateek assigned this job to Puchi, so for each day, he wants to know the number of days
in future when Puchi will have to carry the luggage , having weight less than the weight of 
luggage of current day. Please help Prateek for the same.
Input:
The first line contains a single integer T, denoting the number of test cases. In each test case,
the following input will be present:

First line contains an integer N, where N represents the number of friends.
Next N line contains N integers, where ith line contains ith integer, which represents Weighti.
Output:
Output exactly T lines. Each line contains N integer separated by a space, where ith integer represents the number of luggage of future, which are less than the weight of luggage of the current day.
Constraints:

Subtask 1:
1 <= T <= 30
1<= N <= 104
1<= Weighti <= 106
Subtask 2:
1 <= T <= 10
1<= N <= 105
1<= Weighti <= 106
Sample Input:
1
4
2
1
4
3

Sample Output
1 0 1 0
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int T = Integer.parseInt(input.readLine());
		for(int i = 0; i < T; i++){
			int N = Integer.parseInt(input.readLine());
			int[] A = new int[N];
			int[] B = new int[N];
			int[] totals = new int[10000000];
			StringBuilder results = new StringBuilder();
			for(int j = 0; j < N; j++){
				A[j] = Integer.parseInt(input.readLine());
				B[j] = A[j];
			}
			mergeSort(A, 0, A.length-1, totals);
			for(int k = 0; k < B.length; k++){
				results.append(totals[B[k]] + " ");
			}
			System.out.println(results);
		}
    }
    public static void mergeSort(int[] A, int start, int end, int[] totals){
		if(start < end){
			int mid = start + (end - start)/2; //Splits array in two parts
			mergeSort(A, start, mid, totals); //Sort first part of array
			mergeSort(A, mid+1, end, totals); //Sort second part of array
			merge(A, start, mid, end, totals); 
		}
	}
	public static void merge(int A[], int start, int mid, int end, int[] totals){
		int p = start, q = mid+1; 
		int[] temp = new int[end-start+1];
		int k = 0, count = 0, num = 0;
		for(int i = start; i <= end; i++){
			if(p > mid){ //Checks if first part comes to an end or not
				temp[k++] = A[q++];
			}
			else if(q > end){ //Checks if second part comes to an end or not
				num = A[p++];
				temp[k++] = num;
				totals[num] += count;
			}
			else if(A[p] < A[q]){ //Checks which part has smallest element
				num = A[p++];
				temp[k++] = num;
				totals[num] += count;
			}
			else{ 
				num = A[q++];
				temp[k++] = num;
				count++;
			}
		}
		for(int j = 0; j < k; j++){ //Copy sorted elements back to array
			A[start++] = temp[j];
		}
	}
}
