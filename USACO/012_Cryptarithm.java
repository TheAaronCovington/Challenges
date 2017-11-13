/*
ID: xervean1
LANG: JAVA
TASK: crypt1
*/
import java.util.*;
import java.io.*;
public class crypt1 {
    public static boolean isValid(String S, HashSet<Integer> set){
        for(int i = 0; i < S.length(); i++){
            if(!set.contains(Integer.parseInt("" + S.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("crypt1.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
        int N = input.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < N; i++){
            set.add(input.nextInt());
        }
        int count = 0;
        for(int i = 100; i <= 999; i++){
            if(!isValid("" + i, set)){
                continue;
            }
            for(int j = 10; j <= 99; j++){
                if(!isValid("" + j, set)){
                    continue;
                }
                String temp = "" + (j % 10 * i);
                String temp2 = "" + (j / 10 * i);
                String temp3 = "" + (j % 10 * i + (j / 10 * i) * 10);
                if(temp2.length() == 3 && temp.length() == 3 && temp3.length() == 4 && isValid(temp,set) && isValid(temp2, set) && isValid(temp3, set)){
                    count++;
                }
            }
        }
        out.println(count);
        out.close();
    }
}
