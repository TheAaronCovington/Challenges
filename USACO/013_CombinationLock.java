/*
ID: xervean1
LANG: JAVA
TASK: combo
*/
import java.util.*;
import java.io.*;
public class combo {
    public static boolean isValid(int num1, int num2, int N){
        if(Math.abs(num1-num2) <= 2){
            return true;
        }
        if(Math.abs(num1-num2) >= N-2){
            return true;
        }
        return false;
    }
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("combo.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
        int N = input.nextInt();
        int farmer1 = input.nextInt();
        int farmer2 = input.nextInt();
        int farmer3 = input.nextInt();
        int master1 = input.nextInt();
        int master2 = input.nextInt();
        int master3 = input.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    if((isValid(i, farmer1, N) && isValid(j, farmer2, N) && isValid(k, farmer3, N)) || (isValid(i, master1, N) && isValid(j, master2, N) && isValid(k, master3, N))){
                        count++;
                    }
                }
            }
        }
        out.println(count);
        out.close();
    }
}
