/*
ID: xervean1
LANG: JAVA
TASK: palsquare
*/
import java.util.*;
import java.io.*;
public class palsquare {
    public static boolean isPalindrome(String test){
        int N = test.length();
        int end = test.length()-1;
        for(int i = 0; i < N/2; i++){
            if(test.charAt(i) != test.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("palsquare.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
        int base = input.nextInt();
        for(int i = 1; i <= 300; i++){
            String test = Integer.toString(Integer.parseInt("" + (i*i), 10), base);
            if(isPalindrome(test)){
                out.println(Integer.toString(Integer.parseInt("" + (i), 10), base).toUpperCase() + " " + test.toUpperCase());
            }
        }
        out.close();
    }
}
