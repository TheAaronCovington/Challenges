/* DESCRIPTION: This program reads in a string of numbers and then loops through the string checking to see if
                each digit is even.  If it is then we increment the count.  We then format the output and print
                results as described in problem specification linked below.
   LINK: https://www.hackerearth.com/problem/algorithm/intelligent-girl-1/
*/
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        String output = "";
        int count = 0;
        for(int i = S.length()-1; i >= 0; i--){
        	if(Character.getNumericValue(S.charAt(i))%2 == 0){
        		count++;
        	}
        	output = count + " " + output;
        }
        System.out.println(output);
    }
}
