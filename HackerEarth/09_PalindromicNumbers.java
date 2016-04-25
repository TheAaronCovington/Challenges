/* DESCRIPTION:  Given A and B, count the numbers N such that A ≤ N ≤ B and N is a palindrome.
    Examples: 
      Palindromes: 121, 11 , 11411 
      Not Palindromes: 122, 10
    Input: 
      First line contains T, the number of testcases. Each testcase consists of two integers A and B in one line.
    Output: 
      For each testcase, print the required answer in one line.
    Constraints: 
      1 ≤ T ≤ 10 
      0 ≤ A ≤ B ≤ 105
    Sample Input
     2
      10 13
      20 30
    Sample Output
     1
     1
*/

import java.util.Scanner;

class TestClass {
	public static boolean isPalindrome(String test){
		int N = test.length();
		int count = test.length()-1;
		for(int i = 0; i < N/2; i++){
			if(test.charAt(i) == test.charAt(count)){
				count--;
			}
			else{
				return false;
			}
		}
		return true;
	}
    public static void main(String args[] ) throws Exception {
    	Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();
		while(T > 0){
			String[] nums = input.nextLine().split(" ");
			int num1 = Integer.parseInt(nums[0]);
			int num2 = Integer.parseInt(nums[1]);
			int count = 0;
			while(num1 <= num2){
				if(isPalindrome(Integer.toString(num1))){
					count++;
				}
				num1++;
			}
			System.out.println(count);
			T--;
		}
    }
}
