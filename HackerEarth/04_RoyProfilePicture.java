/*
  DESCRIPTION: Takes in integer L for length, N for number of iterations, and W and H which are on the 
  same line separated by a space and stand for width and height.  I split them by space and convert to 
  integers storing in variables W and H.  If W or H is < L print "UPLOAD ANOTHER".  If picture is 
  square W and H will be equal and we will print "ACCEPTED". Otherwise we print "CROP IT".
  Solution to:  https://www.hackerearth.com/problem/algorithm/roy-and-profile-picture/description/
*/
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int N = input.nextInt();
        input.nextLine();
        for(int i = 0; i < N; i++){
        	String[] temp = input.nextLine().split(" ");
        	int W = Integer.parseInt(temp[0]);
        	int H = Integer.parseInt(temp[1]);
        	if(W < L || H < L){
        		System.out.println("UPLOAD ANOTHER");
        	}
        	else if(W == H){
        		System.out.println("ACCEPTED");
        	}
        	else{
        		System.out.println("CROP IT");
        	}
        }
    }
}
