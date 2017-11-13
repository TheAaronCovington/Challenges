/*
ID: xervean1
LANG: JAVA
TASK: barn1
*/
import java.util.*;
import java.io.*;
public class barn1 {
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("barn1.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int maxBoards = input.nextInt();
        int N = input.nextInt();
        int T = input.nextInt();
        int[] stalls = new int[T];
        for(int i = 0; i < T; i++){
            int num = input.nextInt();
            stalls[i] = num;
            
        }
        Arrays.sort(stalls); //make sure stalls are in correct order
        //Store all the gaps in a min priority queue
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - stalls[i-1] > 1){
                pq.add(stalls[i] - stalls[i-1]-1);
            }
        }
        int sum = T;
        int boards = pq.size()+1;
        while(boards > maxBoards){
            sum += pq.poll();
            boards--;
        }
        out.println(sum);
        out.close();
    }
}
