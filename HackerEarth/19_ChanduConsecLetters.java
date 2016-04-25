/*
  DESCRIPTION: Solution to "Chandu and Consecutive Letters" CodeMonk problem on HackerEarth.  Chandu is very fond 
  of strings. (Or so he thinks!) But, he does not like strings which have same consecutive letters. No one has any
  idea why it is so. He calls these strings as Bad strings. So, Good strings are the strings which do not have same
  consecutive letters. Now, the problem is quite simple. Given a string S, you need to convert it into a Good String.
  You simply need to perform one operation - if there are two same consecutive letters, delete one of them.
  Input:
  The first line contains an integer T, denoting the number of test cases.
  Each test case consists of a string S, which consists of only lower case letters.
  Output:
  For each test case, print the answer to the given problem.
  Constraints:
  1 <= T <= 10
  1 <= |S| <= 30
  
  Sample Input:
  3
  abb
  aaab
  ababa
  
  Sample Output:
  ab
  ab
  ababa
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for(int i = 0; i < T; i++){
        	char[] s = input.nextLine().toCharArray();
        	String output = "" + s[0]; //We must store  s[0] otherwise it will be skipped
        	for(int j = 1; j < s.length; j++){
        		if(s[j] != s[j-1]){ //If current letter is not equal to last letter copy to output since unique
        			output = output + s[j];
        		}
        	}
        	System.out.println(output);
        }
    }
}
