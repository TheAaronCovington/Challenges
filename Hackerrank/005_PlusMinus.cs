using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
        double pos = 0;
        double zer = 0;
        double neg = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] > 0){
                pos++;
            }
            else if(arr[i] == 0){
                zer++;
            }
            else{
                neg++;
            }
        }
        if(pos == 0){
            pos = 0;
        }
        else{
            pos = pos/N;
        }
        if(neg == 0){
            neg = 0;
        }
        else{
            neg = neg/N;
        }
        if(zer == 0){
            zer = 0;
        }
        else{
            zer = zer/N;
        }
        Console.WriteLine(pos+ "\n" + neg + "\n" + zer);
    }
}