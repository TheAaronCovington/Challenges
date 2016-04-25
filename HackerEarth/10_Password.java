/* DESCRIPTION:  Program takes an integer N representing the number of input strings (password possibilities, 
                 creates a hashmap and a list, and then loops through each element adding them to both the map and
                 the list.  The second loop reverses the strings and then checks to see if the map contains the 
                 reversed string.  If it does then we print the length of the string and the middle character.
                 
   LINK: https://www.hackerearth.com/problem/algorithm/password-1/
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class TestClass {
	public static String reverse(String test){
		StringBuilder output = new StringBuilder(test.length());
		int N = test.length()-1;
		for(int i = 0; i < test.length(); i++){
			output.append(test.charAt(N));
			N--;
		}
		return new String(output);
	}
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < N; i++){
			String temp = input.nextLine();
			map.put(temp, i);
			list.add(temp);
		}
		for(int i = 0; i < N; i++){
			String temp = reverse(list.get(i));
			int L = temp.length()-1;
			if(map.containsKey(temp)){
				System.out.println(temp.length() + " " + temp.charAt(L/2));
				return;
			}
		}
  }
}
