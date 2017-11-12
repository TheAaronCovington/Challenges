/*
ID: xervean1
LANG: JAVA
TASK: namenum
*/
import java.util.*;
import java.io.*;
public class namenum {
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("namenum.in")));
        Scanner names = new Scanner(new BufferedReader(new FileReader("dict.txt")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
        
        String brand = input.nextLine();
        boolean flag = false;
        while(names.hasNextLine()){
            String s = names.nextLine();
            String result = "";
            if(s.length() == brand.length()){
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C'){
                        result += "2";
                    }
                    else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F'){
                        result += "3";
                    }
                    else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I'){
                        result += "4";
                    }
                    else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L'){
                        result += "5";
                    }
                    else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O'){
                        result += "6";
                    }
                    else if(s.charAt(i) == 'P' || s.charAt(i) == 'R' || s.charAt(i) == 'S'){
                        result += "7";
                    }
                    else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V'){
                        result += "8";
                    }
                    else if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y'){
                        result += "9";
                    }
                }
                if(result.equals(brand)){
                    out.println(s);
                    flag = true;
                }
            }
        }
        if(!flag){
            out.println("NONE");
        }
        out.close();
    }
}
