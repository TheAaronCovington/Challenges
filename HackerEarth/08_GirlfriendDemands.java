/* DESCRIPTION:  Like most of the girlfriends, Ashima when asks for something, won’t stop until she gets that.
                The way she gets that is by keep on repeating the same things again and again. Like if she wants
                chocolate, she will just keep on repeating “chocolate” again and again. 

                I have decided to answer to her demands as “Yes” or “No” by not delaying a lot. Otherwise, there
                would be a lot of repercussions. So, randomly at certain intervals, I just answer with “Yes” or 
                “No” using the following rule, I will just select two integers a and b, if the element at the position
                a is same as the element as position b in the non-ending chant by Ashima, I will speak “Yes”, otherwise
                say “No”. 
                Your job is to find my side of the conversation given the name of the demand Ashima has and the random
                integers I picked. 
    Input:
    1.) First line of the input contains a string S, the name of the item she is demanding.
    2.) Next line contains an integer Q, the number of pairs of integers that used to say “Yes” or “No” to her. 
    These pairs are given in order.
    3.) Next Q line, each contains 2 integers, a and b. (1-based indexing) 

    Output:
    For each query, print “Yes” or “No” as described above.
    Constraints:
      1 ≤ |S| ≤ 105
      1 ≤ Q ≤ 105
      1 ≤ a, b ≤ 1018

    Sample Input
     vgxgp
    3
    2 4
    2 5
    7 14
    Sample Output
     Yes
    No
    Yes
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String S = input.readLine();
        long N = S.length();
        int Q = Integer.parseInt(input.readLine());
        StringBuilder output = new StringBuilder();
        while(Q > 0){
        	String[] nums = input.readLine().split(" ");
        	long x = Long.parseLong(nums[0]);
        	long y = Long.parseLong(nums[1]);
        	if(S.charAt((int)((x-1L)%N)) == S.charAt((int)((y-1L)%N))){
        		output.append("Yes\n");
        	}
        	else{
        		output.append("No\n");
        	}
        	Q--;
        }
        System.out.println(output);
    }
}
