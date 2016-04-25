/*
  DESCRIPTION: Solution to the "Life Universe Everything" problem.  Reads in numbers
  and prints them out until number 42 is read.  Super easy problem, probably easiest on the site.
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num != 42){
        	System.out.println(num);
        	num = input.nextInt();
        }
    }
}
