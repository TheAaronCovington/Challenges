/* DESCRIPTION:  There is nothing more beautiful than just an integer number.
The beauty of an integer is the number of distinct digits it contains in decimal notation.
You are given an integer number n. Return the beauty of this number. 
*/
using System.Collections.Generic;
class TheBeauty{
		public int find(int N) {
            string S = N.ToString();
            var set = new HashSet<int>();
            for (int i = 0; i < S.Length; i++) {
                set.Add(int.Parse(S[i] + ""));
            }
            return set.Count;
        }
}
