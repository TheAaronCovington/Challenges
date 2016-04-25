import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String[] data = input.nextLine().split(" ");
        long sum = 0L;
        for(int i = 0; i < N; i++){
            sum = sum + Long.parseLong(data[i], 10);
        }
        System.out.println(sum);
    }
}