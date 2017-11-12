/*
ID: xervean1
LANG: JAVA
TASK: milk
*/
import java.util.*;
import java.io.*;
public class milk {
    static class Farmer implements Comparable{
        int pricePerUnit;
        int unitsAvailable;
        Farmer(int pricePerUnit, int unitsAvailable){
            this.pricePerUnit = pricePerUnit;
            this.unitsAvailable = unitsAvailable;
        }
        @Override
        public int compareTo(Object farmer) {
            int test = ((Farmer)farmer).pricePerUnit;
            return this.pricePerUnit - test;
        }
    }
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("milk.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
        int goal = input.nextInt();
        int N = input.nextInt();
        ArrayList<Farmer> list = new ArrayList<Farmer>();
        for(int i = 0; i < N; i++){
            int pricePerUnit = input.nextInt();
            int unitsAvailable = input.nextInt();
            Farmer farmer = new Farmer(pricePerUnit,unitsAvailable);
            list.add(farmer);
        }
        Collections.sort(list);
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).unitsAvailable <= goal){
                goal -= list.get(i).unitsAvailable;
                sum += (list.get(i).unitsAvailable * list.get(i).pricePerUnit);
            }
            else{
                int need = list.get(i).pricePerUnit * goal;
                goal = 0;
                sum += need;
            }
            if(goal == 0){
                break;
            }
        }
        out.println(sum);
        out.close();
    }
}
