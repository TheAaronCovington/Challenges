/*
ID: xervean1
LANG: JAVA
TASK: friday
*/
import java.util.*;
import java.io.*;
public class friday {

	public static void main (String [] args) throws IOException {
	    BufferedReader input = new BufferedReader(new FileReader("friday.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
	    int T = Integer.parseInt(input.readLine());
	    int[] days = {0, 0, 0, 0, 0, 0, 0};
	    int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    int year = 1900; int day = 13;
	    boolean isLeap = false;
	    while(T-- > 0){
	    	if(year % 4 == 0){
	    		isLeap = true;
	    		if(year % 100 == 0){
	    			isLeap = false;
	    			if(year % 400 == 0){
	    				isLeap = true;
	    			}
	    		}
	    	}
	    	if(isLeap == true){
	    		months[2] = 29;
	    	}
	    	else{
	    		months[2] = 28;
	    	}
	    	for(int i = 1; i <= 12; i++){
	    		days[day % 7]++; //calculate appropriate day of the week
	    		day += months[i];
	    	}
	    	year++;
	    	isLeap = false;
	    }
	    for(int i = 0; i < days.length; i++){
	    	if(i == 0){
	    		out.print(days[days.length-1]);
	    	}
	    	else{
	    		out.print(" " + days[i-1]);
	    	}
	    }
	    out.println();
	    out.close();
	  }
}
