/*  DESCRIPTION:  The distance between two strings with respect to a letter is defined as (n1 - n2)2, where 
n1 and n2 are the number of occurrences (both lowercase and uppercase) of that letter in the first and second
strings, respectively. The distance between two strings with respect to a third string is the sum of the distances
between the two strings with respect to each letter in the third string.
You will be given three Strings a, b and letterSet. All the letters in letterSet will be distinct. Return the 
distance between a and b with respect to letterSet.
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
class DistanceBetweenStrings{
	public int getDistance(string a, string b, string letterSet) {
            a = a.ToLower();
            b = b.ToLower();
            var mapA = new Dictionary<char, int>();
            var mapB = new Dictionary<char, int>();
            for (int i = 0; i < a.Length; i++) {
                if (mapA.ContainsKey(a[i])) {
                    mapA[a[i]]++;
                }
                else {
                    mapA[a[i]] = 1;
                }
            }
            for (int i = 0; i < b.Length; i++) {
                if (mapB.ContainsKey(b[i])) {
                    mapB[b[i]]++;
                }
                else {
                    mapB[b[i]] = 1;
                }
            }
            double result = 0;
            for (int i = 0; i < letterSet.Length; i++) {
                if (!mapA.ContainsKey(letterSet[i])){
                    mapA[letterSet[i]] = 0;
                }
                if (!mapB.ContainsKey(letterSet[i])) {
                    mapB[letterSet[i]] = 0;
                }
                result += Math.Pow(Math.Max(mapA[letterSet[i]], mapB[letterSet[i]]) - Math.Min(mapA[letterSet[i]], mapB[letterSet[i]]), 2);
            }
            return (int)result;
        }
}
