/*
ID: xervean1
LANG: JAVA
TASK: dualpal
*/
import java.util.*;
import java.io.*;
public class dualpal {
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
        Scanner input = new Scanner(new BufferedReader(new FileReader("dualpal.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
        int count = 0;
        int N = input.nextInt();
        int S = input.nextInt() + 1;
        while(count < N){
            int palCount = 0;
            int base = 2;
            boolean flag = false;
            while(palCount < 2 && base <= 10){
                String test = Integer.toString(Integer.parseInt("" + S, 10), base);
                if(isPalindrome(test)){
                    palCount++;
                }
                base++;
                if(palCount == 2){
                    flag = true;
                }
            }
            if(flag){
                out.println(S);
                count++;
            }
            S++;
        }
        out.close();
    }
}
