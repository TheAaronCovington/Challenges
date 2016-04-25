/* 
DESCRIPTION: You are asked to calculate factorials of some small positive integers.
Input:
An integer T, denoting the number of testcases, followed by T lines, each containing a single integer N.
Output:
For each integer N given at input, output a single line the value of N!
Input Constraint:
1 <= T <= 100
1 <= N <= 100  
NOTE: Because in the worst case we have to find factorial of 100, int and long primitive types
do not allow for large enough numbers, so we must use the BigInteger class.
*/
import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;
class TestClass {
  public static BigInteger factorial(Integer num){
    if(num == 1){ //Base case, must be BigInteger.ONE instead of just 1
      return BigInteger.ONE; 
    } //Equivalent of num*factorial(num-1) using BigInteger
    return factorial(num-1).multiply(new BigInteger(String.valueOf(num))); 
  }
  
  public static void main(String args[] ) throws Exception {
    Scanner input = new Scanner(System.in);
    int T = input.nextInt(); //Take as input number of test cases
    ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList to store input variables
    for(int i = 0; i < T; i++){
      list.add(Integer.valueOf(input.nextInt())); //Store each input number entered into the list
    }
    //Create BigInteger output list because some of our factorial outputs will be too large for even a "long" to handle
    ArrayList<BigInteger> output = new ArrayList<BigInteger>(); 
    for(Integer x : list){
      output.add(factorial(x)); //get the factorial of each element in the input list and store in output list.
    }
    for(BigInteger x: output){
      System.out.println(x); //print results
    }
  }
