/*
  DESCRIPTION:  Prateek wants to give a party to his N friends on his birthday, where each
  friend is numbered from 1 to N. His friends are asking for a gift to come to the party, 
  instead of giving him one. The cost of the gifts are given in the array Value where ith 
  friend asks for a gift which has a cost Costi.  But, Prateek has only X amount of money
  to spend on gifts and he wants to invite his friends which are in continuous range such 
  that sum of the cost of the gifts of those friends will be exactly equal to X.  If he can
  invite his friends, who can satisfy the above condition then, print YES otherwise print NO.
Input:
The first line contains a single integer T, denoting the number of test cases. In each test case, 
the following input will be present: - The next line contains two space-separated integers N and X,
where N represents the number of friends and X represents amount of money which Prateek can spend on gifts.
- Next N line contains N integers, where ith line contains ith integer, which represents the Costi .
Ouput:
Output exactly T lines, each containing the answer to the corresponding test case.
Constraints:
1 <= T <= 10
1 <= N , Costi <= 106
1 <= X <= 1012
Sample Input:
1
5 12
1
3
4
5
2
Sample Output:
YES
Explanation:  In the sample input, T is equal to 1. So, accordingly, in next line, values of
N and X are given which are 5 and 12 respectively. In the next 5 lines, you have costi asked
by ith friend. As friends numbered from 2 to 4 (inclusively) have gifts value which are 
{3, 4, 5}, and their sum equals to 12 - that is, the given value of X. So, the answer is YES.
*/

/*NOTE:  Had to use BufferedReader and not Scanner due to 1 sec time limit per input file.
The huge input on test case 3 kept timing out when using Scanner and I remember reading that
BufferedReader and InputstreamReader are actually faster.*/
import java.io.BufferedReader; 
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(input.readLine());
		for(int i = 0; i < T; i++){
			String[] temp = input.readLine().split(" ");
			int N = Integer.parseInt(temp[0]); //Friend count
			int X = Integer.parseInt(temp[1]); //Total Money
			int[] friends = new int[N];
			int sum = 0;
			for(int j = 0; j < N; j++){
				friends[j] = Integer.parseInt(input.readLine());
			}
	
			for(int k = 0; k < N; k++){
				sum = friends[k];
				if(sum == X){
					System.out.println("YES");
					break;
				}
				for(int l = k + 1; l < N; l++){
					sum += friends[l];
					if(sum == X){
						System.out.println("YES");
						break;
					}
					else if(sum > X){
						sum = 0;
						break;
					}
				}
				if(sum == X){
					break;
				}
			}
			if(sum != X){
				System.out.println("NO");
			}
		}
    }
}
