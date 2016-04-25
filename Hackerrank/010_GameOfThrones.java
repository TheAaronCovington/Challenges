import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); int count = 0;
        String ans;
        String inputString = myScan.nextLine();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for(int i = 0; i < inputString.length(); i++){
            if(myMap.containsKey(inputString.charAt(i))){
                myMap.put(inputString.charAt(i), myMap.get(inputString.charAt(i)) + 1);
            }
            else{
                myMap.put(inputString.charAt(i), 1);
            }
        }
        Iterator itr = myMap.values().iterator();
        while(itr.hasNext()){
            Integer test = (Integer)itr.next();
            if(test % 2 != 0){
                count++;
                if(count > 1){
                    ans = "NO";
                    System.out.println(ans);
                    return;
                }
            }
        }
        ans = "YES";
        System.out.println(ans);
        myScan.close();
    }
}