using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string time = Console.ReadLine();
        DateTime test = DateTime.Parse(time);
        String value = test.ToString("HH:mm:ss");
        Console.WriteLine(value);
    }
}