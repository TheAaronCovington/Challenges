using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static String reverse(String S){
        char[] myArray = S.ToCharArray();
        Array.Reverse(myArray);
        return new String(myArray);
    }
    static void Main(String[] args) {
        bool fun = true;
        int T = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < T; i++){
            String S = Console.ReadLine();
            String R = reverse(S);
            for(int j = 1; j < S.Length; j++){
                if(Math.Abs(S[j] - S[j-1]) != Math.Abs(R[j] - R[j-1])){
                    fun = false;
                }
            }
            if(fun == true){
                Console.WriteLine("Funny");
            }
            else{
                Console.WriteLine("Not Funny");
            }
            fun = true;
        }
    }
}