using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int T = Convert.ToInt32(Console.ReadLine());
        int count = 0;
        for(int i = 0; i < T; i++){
            String S = Console.ReadLine();
            for(int j = 0; j < S.Length-1; j++){
                if(S[j] == S[j+1]){
                    count++;
                }
            }
            Console.WriteLine(count);
            count = 0;
        }
    }
}