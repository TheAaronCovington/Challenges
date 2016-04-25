import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                        'q','r','s','t','u','v','w','x','y','z'};
        String s = input.nextLine().toLowerCase();
        for(int i = 0; i < alpha.length; i++){
            if(s.indexOf(alpha[i]) == -1){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}