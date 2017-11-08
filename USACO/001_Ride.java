/*
ID: xervean1
LANG: JAVA
TASK: ride
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ride {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(new BufferedReader(new FileReader("ride.in")));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    String comet = input.nextLine();
    int prod1 = 1, prod2 = 1;
    String group = input.nextLine();
    for(int i = 0; i < comet.length(); i++) {
      int temp = (comet.charAt(i) - 'A') + 1;
      prod1 *= temp;
    }
    for(int i = 0; i < group.length(); i++) {
      int temp = (group.charAt(i) - 'A') + 1;
      prod2 *= temp;
    }
    if(prod1 % 47 == prod2 % 47) {
      out.println("GO");
    }
    else {
      out.println("STAY");
    }
    out.close();
  }
}
