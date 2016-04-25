using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int T = Convert.ToInt32(Console.ReadLine()); int flag;
        long[] A = new long[100000];
        long max, max2, max3;
        for(int i = 0; i < T; i++){
            int N = Convert.ToInt32(Console.ReadLine());
            String[] temp = Console.ReadLine().Split(' ');
            for(int j = 0; j < N; j++){
                A[j] = Convert.ToInt64(temp[j]);
            }
            flag = 0; max = 0; max2 = 0; max3= 0;
            for(int k = 0; k < N; k++){
                max = max + A[k];
                if(max < 0){
                    max = 0;
                }
                if(max2 < max){
                    max2 = max;
                }
                if(A[k] > 0){
                    max3 = max3 + A[k];
                    flag = 1;
                }
            }
            if(flag == 0){
                Console.WriteLine("{0} {1}", A[0], A[0]);
            }
            else{
                Console.WriteLine("{0} {1}", max2, max3);
            }
        }
    }
}