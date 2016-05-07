/*  DESCRIPTION:  	Your printer has been infected by a virus and is printing gibberish. After staring at several 
printed pages for a while, you realize that it is printing every line inside-out. In other words, the left half of
each line is being printed starting in the middle of the page and proceeding out toward the left margin. Similarly,
the right half of each line is being printed starting at the right margin and proceeding in toward the middle of the
page. For example, the line
" THIS LINE IS GIBBERISH"
is being printed as:
"I ENIL SIHTHSIREBBIG S"
Your task is to unscramble a String line from its printed form back into its original order. You can assume that
line contains an even number of characters.
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
class InsideOut{
        public string reverse(string S) {
            char[] temp = S.ToCharArray();
            Array.Reverse(temp);
            return new string(temp);
        }
        public string unscramble(string line) {
            int N = line.Length;
            string one = reverse(line.Substring(0, N/2));
            string two = reverse(line.Substring(N / 2, N - (N / 2)));
            return one + two;
        }
}
