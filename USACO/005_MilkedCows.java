/*
ID: xervean1
LANG: JAVA
TASK: milk2
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class milk2 {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(new BufferedReader(new FileReader("milk2.in")));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
    int T = input.nextInt();
    int[] timeline = new int[1000000];
    int maxMilked = -1; int milkCount = 0;
    int maxNot = -1; int notCount = 0;
    int lowest = 1000000; int largest = -1;
    while(T-- > 0) {
      int start = input.nextInt();
      int end = input.nextInt();
      if(start < lowest) {
        lowest = start;
      }
      if(end > largest) {
        largest = end;
      }
      for(int i = start; i < end; i++) {
        timeline[i] = 1;
      }
    }
    //search for longest interval at least one cow was milked
    for(int i = lowest; i < largest; i++) {
      if(timeline[i] == 1) {
        milkCount++;
        if(milkCount > maxMilked) {
          maxMilked = milkCount;
        }
      }
      else {
        if(milkCount > maxMilked) {
          maxMilked = milkCount;
        }
        milkCount = 0;
      }
    }
    
    //search for longest interval that no cow was being milked
    for(int i = lowest; i < largest; i++) {
      if(timeline[i] == 0) {
        notCount++;
      }
      else {
        if(notCount > maxNot) {
          maxNot = notCount;
        }
        notCount = 0;
      }
    }
    out.println(maxMilked + " " + maxNot);
    out.close();
  }
}
