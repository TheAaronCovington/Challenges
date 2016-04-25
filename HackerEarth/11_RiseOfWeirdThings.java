/* DESCRIPTION:  This program first reads in an integer representings the nunber of integers on line 2
                 of the input.  I then loop through and add the even and odd numbers to their own respective
                 lists while also keeping track of the sum of each.  I then sort both lists and then  loop through
                 the lists and formulate the output as instructed in the problem specification linked below.
   LINK: https://www.hackerearth.com/problem/algorithm/the-rise-of-the-weird-things-1/
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        int N = input.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        String output = "";
        for(int i = 0; i < N; i++){
        	int temp = input.nextInt();
        	if(temp % 2 == 0){
        		even.add(temp);
        		evenSum += temp;
        	}
        	else{
        		odd.add(temp);
        		oddSum += temp;
        	}
        }
        Collections.sort(even);
        Collections.sort(odd);
        for(int i = 0; i < even.size(); i++){
        	output = output + even.get(i) + " ";
        }
        output += evenSum + " ";
        for(int i = 0; i < odd.size(); i++){
        	output = output + odd.get(i) + " ";
        }
        output += oddSum;
        System.out.println(output);
    }
}
