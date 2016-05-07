/*  DESCRIPTION:  Consider a necklace composed of marbles of various colors arranged in a circle. The colors are 
represented by uppercase letters. We can describe a necklace with a string of characters as follows: start with any
marble and go through all the marbles in either a clockwise or counter-clockwise direction, until the starting marble 
is reached again, meanwhile appending to the string the colors of the marbles in the order they are visited. Obviously, 
there could be many different strings describing the same necklace. For example, the necklace described by the string "CDAB"
can also be described by seven other strings (see example 0).
You are given a String necklace containing the description of a necklace. Return the description for that necklace that comes
earliest alphabetically.
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
class MarbleNecklace{
		public string normalize(string necklace) {
            char[] colors = necklace.ToCharArray();
            char[] result = new char[colors.Length];
            var list = new List<string>();
            int N = colors.Length;
            int R = 1;
            for (int i = 0; i < necklace.Length; i++) {
                for (int j = 0; j < colors.Length; j++) {
                    result[j] = colors[(j + R) % N];
                }
                list.Add(new string(result));
                R++;
            }
            R = 1;
            Array.Reverse(colors);
            for(int i = 0; i < necklace.Length; i++) {
                for (int j = 0; j < colors.Length; j++) {
                    result[j] = colors[(j + R) % N];
                }
                list.Add(new string(result));
                R++;
            }
            list.Sort();
            return list[0];
        }
}
