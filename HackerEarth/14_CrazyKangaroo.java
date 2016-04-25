/* DESCRIPTION:  This program reads in T test cases and the next line contains 3 longs A B and M.
                 For the program to work B must be greater than A so if it isn't we do a swap.  We
                 can do this because A is the starting location and B is the ending location. To get the
                 number of hops we divide the ending and starting location by M.  Because it is inclusive we
                 subtract 1 from the starting location A.  We then take the difference so the formula is
                 (B/M) - ((A-1)/M).  Because of strict time constraints (1 sec per input file) we must use
                 StringBuilder to construct our output.
   LINK:  https://www.hackerearth.com/problem/algorithm/crazy-kangaroo/description/
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        StringBuilder output = new StringBuilder(T);
        long result = 0;
        while(T > 0){
        	long A = input.nextLong();
        	long B = input.nextLong();
        	long M = input.nextLong();
        	if(B < A){
        		long temp = B;
        		B = A;
        		A = temp;
        	}
        	result = (B/M) - ((A-1)/M);
        	output.append(result + "\n");
        	T--;
        }
        System.out.println(output);
        
    }
}
