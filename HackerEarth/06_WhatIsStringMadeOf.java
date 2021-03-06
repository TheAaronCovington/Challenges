/* Solution to "What is the String Made Of?"
 DESCRIPTION: You are given a string, which contains entirely of decimal digits (0-9). Each digit
 is made of a certain number of dashes, as shown in the image below. For instance 1 is made of 2
 dashes, 8 is made of 7 dashes and so on.  You have to write a function that takes this string 
 message as an input and returns a corresponding value in terms of a number. This number is the 
 count of dashes in the string message.  0 consists of 6 dashes, 1 consists of 2 dashes, 2 consists 
 of 5 dashes, 3 consists of 5 dashes, 4 consists of 4 dashes, 5 consists of 5 dashes, 6 consists of
 6 dashes, 7 consists of 3 dashes [though the figure shows that 7 consists of 4 dashes but due to 
 minor mistake in the problem please write your solution assuming 7 consists of 3 dashes],
 8 consists of 7 dashes, 9 consists of 6 dashes.
 
  CONSTRAINTS: String message will contain at least one digit, but not more than 100
  Each character in code will be a digit ('0'-'9').
  
  Sample Input:
  12134
  Sample Output:
  18
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
		int[] dashes = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int sum = 0;
		char[] numString =  input.nextLine().toCharArray();
		for(int i = 0; i < numString.length; i++){
			sum = sum + dashes[Character.getNumericValue(numString[i])];
		}
		System.out.println(sum);
    }
}
