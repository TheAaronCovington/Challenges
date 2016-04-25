/*DESCRIPTION:  A string is said to be complete if it contains all the characters 
from a to z. Given a string, check if it complete or not.
Input
First line of the input contains the number of strings N. It is followed by N lines each contains a single string.
Output
For each test case print "YES" if the string is complete, else print "NO"
Constraints
1 <= N <= 10
The length of the string is at max 100 and the string contains only the characters a to z

Sample Input:
3
wyyga
qwertyuioplkjhgfdsazxcvbnm
ejuxggfsts

Sample Output:
NO
YES
NO
*/
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
    	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
    	'q','r','s','t','u','v','w','x','y','z'};
    	boolean flag;
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      input.nextLine();
      for(int i = 0; i < N; i++){
      	flag = true;
      	String myString = input.nextLine();
      	for(int j = 0; j < alpha.length; j++){
      		if(myString.indexOf(alpha[j])==-1){
      			System.out.println("NO");
      			flag = false;
      			break;
      		}
      	}
      	if(flag == true){
      		System.out.println("YES");
      	}
      }
    }
}
