/*
ID: xervean1
LANG: JAVA
TASK: gift1
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class gift1 {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(new BufferedReader(new FileReader("gift1.in")));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    List<String> names = new ArrayList<String>();
    Map<String, Integer> map = new HashMap<String, Integer>();
    int T = Integer.parseInt(input.nextLine());
    for(int i = 0; i < T; i++) {
      String temp = input.nextLine();
      names.add(temp);
      map.put(temp, 0);
    }
    while(T-- > 0) {
      String name = input.nextLine();
      String[] nums = input.nextLine().split(" ");
      int amount = Integer.parseInt(nums[0]);
      int friends = Integer.parseInt(nums[1]);
      int gift = -1, left = -1;
      if(friends != 0) {
        gift = amount / friends;
        left = amount % friends;
      }
      else {
        gift = 0;
        left = amount;
      }
      map.put(name, map.get(name) - amount + left);
      for(int i = 0; i < friends; i++) {
        String current = input.nextLine();
        map.put(current, map.get(current) + gift);
      }
    }
    for(int i = 0; i < names.size(); i++) {
      out.println(names.get(i) + " " + map.get(names.get(i)));
    }
    out.close();
  }
}
