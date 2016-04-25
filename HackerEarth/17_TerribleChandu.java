/*
DESCRIPTION: Chandu is a bad student. Once his teacher asked him to print the reverse of a 
given string. He took three hours to solve it. The teacher got agitated at Chandu and 
asked you the same question. Can you solve it?

Input:
The first line contains an integer T, denoting the number of test cases.
Each test case contains a string S, comprising of only lower case letters.

Output:
For each test case, print the reverse of the string S.

Constraints:

1 <= T <= 10
1 <= |S| <= 30

Sample Input:
2
ab
aba

Sample Output:
ba
aba
*/

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        while(T > 0){
        	String S = input.nextLine();
        	String temp = "";
        	for(int i = 0; i < S.length(); i++){
        		temp = S.charAt(i) + temp;
        	}
        	System.out.println(temp);
        	T--;
        }
    }
}
