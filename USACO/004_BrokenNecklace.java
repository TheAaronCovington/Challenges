/*
ID: xervean1
LANG: JAVA
TASK: beads
*/
import java.util.*;
import java.io.*;
public class beads {
	public static int count(String S){
		int sum = 0;
		char ch;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == 'w'){
				sum++;
			}
			else{
				ch = S.charAt(i);
				for(int j = i; j < S.length(); j++){
					if(S.charAt(j) == ch || S.charAt(j) == 'w'){
						sum++;
					}
					else{
						break;
					}
				}
				break;
			}
		}
		//System.out.println(sum);
		for(int i = S.length()-1; i >= 0; i--){
			if(S.charAt(i) == 'w'){
				sum++;
			}
			else{
				ch = S.charAt(i);
				for(int j = i; j >= 0; j--){
					if(S.charAt(j) == ch || S.charAt(j) == 'w'){
						sum++;
					}
					else{
						break;
					}
				}
				break;
			}
		}
		if(sum > S.length()){
			sum = S.length();
		}
		return sum;
	}
	public static String process(String word, int N){
		String temp = "";
		temp += word.substring(N);
		if(N != 0){
			temp += word.substring(0, N);
		}
		return temp;
	}
	public static void main (String [] args) throws IOException {
	    BufferedReader input = new BufferedReader(new FileReader("beads.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
	    int T = Integer.parseInt(input.readLine());
	    String word = input.readLine();
	    int max = 0;
	    for(int i = 0; i < T; i++){
	    	String S = process(word, i);
	    	int M = count(S);
	    	if(M > max){
	    		max = M;
	    	}
	    	
	    }
	    out.println(max);
	    out.close();
	}
}
