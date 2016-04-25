import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int before = 0; int after = 0;
        int T = input.nextInt();
        for(int i = 0; i < T; i++){
            int N = input.nextInt();
            int K = input.nextInt();
            for(int j = 0; j < N; j++){
                int a = input.nextInt();
                if(a <= 0){
                    before++;
                }
            }
            if(before < K){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            before = 0;
        }
    }
}