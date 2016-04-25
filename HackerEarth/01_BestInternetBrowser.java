/*
DESCRIPTION: 
    You don't need to type 'www.' to open a website anymore.
    Though, you still need to type '.com' to open a website.
    The browser predicts ALL THE VOWELS in the name of the website. (Not '.com', though. Again!)
    Obviously, this means you can type the name of a website faster and save some time.
Now to convince users that his browser will indeed save A LOT of time for users to open a particular 
website, Little Jhool has asked you to prepare a report on the same.

Input format:
The first line contains tc, the number of test cases.
The second line contains the name of websites, as a string.

Output format:
You have to print the ratio of characters you would have typed in Jhool's browser, to your normal browser.

Constraints:
1 <= tc <= 100
1 <= Length of the website <= 200
*/

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        final int www = 4;
        final int com = 4;
        int tc = input.nextInt();
        input.nextLine();
        for(int i = 0; i < tc; i++){
        	String site = input.nextLine();
        	site = site.substring(4);
        	int totalcount = site.length() + 4;
        	int count = totalcount - 4;
        	for(int j = 0; j < site.length(); j++){
        		if(site.toLowerCase().charAt(j) == 'a' ||
        		site.toLowerCase().charAt(j) == 'e' ||
        		site.toLowerCase().charAt(j) == 'i' ||
        		site.toLowerCase().charAt(j) == 'o' ||
        		site.toLowerCase().charAt(j) == 'u'){
        			count--;
        		}
        		if(site.charAt(j) == '.'){
        			break;
        		}
        	}
        	System.out.println(count + "/" + totalcount);
        }
    }
}
