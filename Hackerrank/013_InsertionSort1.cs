using System;
using System.Collections.Generic;
using System.IO;
class Solution {
static void insertionSort(int[] ar) {
    int N = ar.Length; int temp; int j;
    for(int i = 1; i < N; i++){
        temp = ar[i];
        j = i;
        while(j > 0 && temp < ar[j-1]){
            ar[j] = ar[j-1];
            foreach(int x in ar){
                Console.Write(x + " ");
            }
            Console.WriteLine();
            j--;
        }
        ar[j] = temp;
    }
    foreach(int x in ar){
        Console.Write(x + " ");
    }

}
/* Tail starts here */
    static void Main(String[] args) {
           
           int _ar_size;
           _ar_size = Convert.ToInt32(Console.ReadLine());
           int [] _ar =new int [_ar_size];
           String elements = Console.ReadLine();
           String[] split_elements = elements.Split(' ');
           for(int _ar_i=0; _ar_i < _ar_size; _ar_i++) {
                  _ar[_ar_i] = Convert.ToInt32(split_elements[_ar_i]); 
           }

           insertionSort(_ar);
    }
}