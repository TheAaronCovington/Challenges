/*
ID: xervean1
LANG: JAVA
TASK: gift1
*/
import java.util.*;
import java.io.*;
public class gift1 {
	public static void main (String [] args) throws IOException {
	    BufferedReader input = new BufferedReader(new FileReader("gift1.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    List<String> list = new ArrayList<String>();
	    int T = Integer.parseInt(input.readLine());
	    for(int i = 0; i < T; i++){
	    	String temp = input.readLine();
	    	map.put(temp, 0);
	    	list.add(temp);
	    }
	    while(T-- > 0){
	    	String name = input.readLine();
	    	String[] nums = input.readLine().split(" ");
	    	int money = Integer.parseInt(nums[0]);
	    	int friends = Integer.parseInt(nums[1]);
	    	if(friends == 0){
	    		int update = map.get(name);
	    		update += money;
	    		map.put(name, update);
	    		continue;
	    	}
	    	int total = money / friends;
	    	int update = map.get(name);
	    	update -= total * friends;
	    	map.put(name, update);
	    	for(int i = 0; i < friends; i++){
	    		String key = input.readLine();
	    		update = map.get(key);
	    		update += total;
	    		map.put(key, update);
	    	}
	    }
	    for(int i = 0; i < list.size(); i++){
	    	out.println(list.get(i) + " " + map.get(list.get(i)));
	    }
	    out.close();
	  }
}
