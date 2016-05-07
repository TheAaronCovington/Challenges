/* DESCRIPTION:   John and Brus are training for a card game tournament. There they will be playing Black Jack.
Black Jack is played using a standard deck containing 52 distinct cards. Each card can be represented as a 
two-character string where the first character is the rank ('2' - '9' for ranks Two through Nine, 'T' for Ten,
'J' for Jack, 'Q' for Queen, 'K' for King and 'A' for Ace) and the second character is the suit ('S' for Spades,
'C' for Clubs, 'D' for Diamonds and 'H' for Hearts). For example, the Jack of Spades can be represented as "JS" 
and the Nine of Hearts as "9H".
Each time a player receives a card from the deck, his score increases by the card's value. Ranks Two through Ten
have values of 2 - 10, respectively. Jacks, Queens and Kings each have a value of 10, and Aces have a value of 11.
Brus randomly shuffles the full card deck and gives John several cards from the top of the deck. You are given a 
String[] cards, where each element represents a single card given to John. Return John's score after this initial deal. 
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
class TheBlackJackDivTwo{
		public int score(string[] cards) {
            var map = new Dictionary<char, int>() 
            { { '2', 2 }, {'3', 3 }, {'4', 4 }, {'5', 5 },
              {'6', 6 }, {'7', 7 }, {'8', 8}, {'9', 9}, {'T', 10 },
              { 'J', 10 }, {'Q', 10 }, {'K', 10 }, {'A', 11 }
            };
            int total = 0;
            for (int i = 0; i < cards.Length; i++) {
                total += map[cards[i][0]];
            }
            return total;
        }
}
