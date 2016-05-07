/*  DESCRIPTION:  	You are working for the financial institution TopBank, and you have been tasked with writing 
a module that will take an initial account balance, along with a list of that day's transactions, and return the 
ending balance for the day.
Each transaction will be either a credit, which adds funds to the account, or a debit, which removes funds from the 
account. If a debit exceeds the available funds at the time, then the account balance will go negative. You will be
given an int startingBalance, the initial account balance. You will also be given a String[] transactions, the list of
transactions for the day. Each element of transactions will be in the form "type amount" (quotes added for clarity).
Each type will be 'C' or 'D', for credit or debit, respectively. Each amount will be an integer between 1 and 1000000, 
inclusive, with no leading zeros. You are to return an int representing the ending balance after processing all of the transactions.
*/
class AccountBalance{
        public int processTransactions(int startingBalance, string[] transactions) {
            int result = startingBalance;
            for (int i = 0; i < transactions.Length; i++) {
                string[] current = transactions[i].Split(' ');
                if (current[0].Equals("C")){
                    result += int.Parse(current[1]);
                }
                else {
                    result -= int.Parse(current[1]);
                }
            }
            return result;
        }
}
