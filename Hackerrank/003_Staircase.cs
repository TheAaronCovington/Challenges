using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        string hash = "";
        for(int i = 0; i < N; i++){
            for(int j = N-1; j > i; j--){
                Console.Write(" ");
            }
            hash += "#";
            Console.WriteLine(hash);
        }
    }
}