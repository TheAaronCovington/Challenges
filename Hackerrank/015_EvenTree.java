import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] tree = new int[N];
        int[] count = new int[N];
        Arrays.fill(count, 1);
        for(int i = 0; i < M; i++){
            int ui = input.nextInt();
            int vi = input.nextInt();
            tree[ui-1] = vi;
            count[vi-1] += count[ui-1];
            int root = tree[vi-1];
            while(root != 0){
                count[root-1] += count[ui-1];
                root = tree[root-1];
            }
        }
        int temp = -1;
        for(int i = 0; i < M; i++){
            if(count[i] % 2 == 0){
                temp++;
            }
        }
        System.out.println(temp);
    }
}