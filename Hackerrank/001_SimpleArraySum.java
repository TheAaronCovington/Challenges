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
        String[] nums = input.nextLine().split(" ");
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + Integer.parseInt(nums[i]);
        }
        System.out.println(sum);
    }
}