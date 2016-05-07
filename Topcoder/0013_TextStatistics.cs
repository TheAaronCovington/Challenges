/* DESCRIPTION:   Most modern text editors are able to give some statistics about the text they are editing. One 
nice statistic is the average word length in the text.
A word is a maximal continuous sequence of letters ('a'-'z', 'A'-'Z'). Words can be separated by spaces, digits, 
and punctuation marks.
The average word length is the sum of all the words' lengths divided by the total number of words. For example, in 
the text "This is div2 easy problem.", there are 5 words: "This", "is", "div", "easy", and "problem". The sum of 
the word lengths is 4+2+3+4+7=20, so the average word length is 20/5=4.
Given a String text, return the average word length in it. If there are no words in the text, return 0.0. 
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
class TextStatistics{
		public double averageLength(string text) {
            text = Regex.Replace(text, @"[,.?!-+]+", "");
            string[] words = text.Split(' ');
            double average = 0.0;
            for (int i = 0; i < words.Length; i++) {
                average += words[i].Length;
            }
            average /= words.Length;
            return Math.Floor(average);
        }
}
