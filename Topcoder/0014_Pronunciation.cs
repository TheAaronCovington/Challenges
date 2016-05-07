/* DESCRIPTION: Peter has problems with pronouncing difficult words. In particular he can't pronounce words that 
contain three or more consecutive consonants (such as "street" or "first"). Furthermore he can't pronounce words
that contain two or more consecutive vowels that are different (such as "goal" or "beauty"). He can pronounce words
with two consecutive equal vowels though (such as "need").
Is this problem we consider the 'y' to be always a consonant, even in words like "any". So the vowels are 'a', 'e', 'i',
'o' and 'u'. You are given a String[] words. If Peter can pronounce all the words, return an empty String; otherwise return
the first word he can't pronounce.
*/
class Pronunciation{
		public string canPronounce(string[] words) {
            string consonant = "bcdfghjklmnpqrstvwxyz";
            string vowel = "aeiou";
            for (int i = 0; i < words.Length; i++) {
                int C = 0; int V = 0;
                char lv = '0';
                string word = words[i].ToLower();
                for (int j = 0; j < word.Length; j++) {
                    if (consonant.IndexOf(word[j]) != -1) {
                        C++;
                        if (C == 3) {
                            return words[i];
                        }
                    }
                    else {
                        C = 0;
                    }
                    if (vowel.IndexOf(word[j]) != -1) {
                        V++;
                        if (V >= 2) {
                            if (word[j] == lv) {
                                break;
                            }
                            else {
                                return words[i];
                            }
                        }
                        lv = word[j];
                    }
                    else {
                        V = 0;
                    }
                }
            }
            return "";
        }
}
