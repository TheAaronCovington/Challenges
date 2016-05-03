/*
ID: xervean1
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.io.*;
public class ride {
	public static void main (String [] args) throws IOException {
	    BufferedReader input = new BufferedReader(new FileReader("ride.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	    String values = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String comet = input.readLine();
	    String group = input.readLine();
	    int sum1 = 1; int sum2 = 1;
	    for(int i = 0; i < comet.length(); i++){
	    	if(values.indexOf(comet.charAt(i)) != -1){
	    		sum1 *= values.indexOf(comet.charAt(i));
	    	}
	    }
	    for(int i = 0; i < group.length(); i++){
	    	if(values.indexOf(group.charAt(i)) != -1){
	    		sum2 *= values.indexOf(group.charAt(i));
	    	}
	    }
	    if(sum1 % 47 != sum2 % 47){
	    	out.println("STAY");
	    }
	    else{
	    	out.println("GO");
	    }
	    out.close();
	  }
}
