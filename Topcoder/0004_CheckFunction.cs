/* DESCRIPTION: You are given a String code containing a message composed entirely of decimal digits ('0'-'9').
Each digit consists of some number of dashes (see diagram below). A "check function" of a message is defined as
the total number of dashes in the message. Return the value of the check function for the message represented in code. 
	0 consists of 6 dashes, 1 consists of 2 dashes, 2 consists of 5 dashes, 3 consists of 5 dashes, 4 consists of 4 dashes,
	5 consists of 5 dashes, 6 consists of 6 dashes, 7 consists of 3 dashes, 8 consists of 7 dashes, 9 consists of 6 dashes.
*/
class CheckFunction{
	public int newFunction(string code) {
            int[] count = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            int sum = 0;
            for (int i = 0; i < code.Length; i++) {
                sum += count[int.Parse(code[i] + "")];
            }
            return sum;
        }
}
