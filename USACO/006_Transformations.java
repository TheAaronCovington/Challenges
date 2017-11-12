/*
ID: xervean1
LANG: JAVA
TASK: transform
*/
import java.util.*;
import java.io.*;
public class transform {
    static int[][] before, after;
    static int[][] test;
    static int N;
    //Check if rotated 90 deg
    public static boolean option1(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(before[i][j] != after[j][N-i-1]){
                    return false;
                }
            }
        }      
        return true;
    }
  //Check if rotated 180 deg
    public static boolean option2(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(before[i][j] != after[N-i-1][N-j-1]){
                    return false;
                }
            }
        }
        return true;
    }
  //Check if rotated 270 deg
    public static boolean option3(){
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(before[i][j] != after[N-j-1][i]){
                    return false;
                }
            }
        }
        return true;
    }
  //Check if reflected horizontally
    public static boolean option4(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(before[i][j] != after[i][N-j-1]){
                    return false;
                }
            }
        }
        return true;
    }
  //Check if reflected horizontally and then rotated
    public static boolean option5(){
        test = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                test[i][N-j-1] = before[i][j];
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                before[i][j] = test[i][j];
            }
        }
        if(option1() || option2() || option3()){
            return true;
        }
        return false;
    }
    //Check if patter isn't changed
    public static boolean option6(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(before[i][j] != after[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    //Testing Method
    public static void print(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new FileReader("transform.in")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
        N = Integer.parseInt(input.nextLine());
        before = new int[N][N];
        after = new int[N][N];
        for(int i = 0; i < N; i++){
            String line = input.nextLine();
            for(int j = 0; j < N; j++){
                if(line.charAt(j) == '@'){
                    before[i][j] = 1;
                }
                else{
                    before[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < N; i++){
            String line = input.nextLine();
            for(int j = 0; j < N; j++){
                if(line.charAt(j) == '@'){
                    after[i][j] = 1;
                }
                else{
                    after[i][j] = 0;
                }
            }
        }
        if(option1()){ out.println(1); }
        else if(option2()){ out.println(2); }
        else if(option3()){ out.println(3); }
        else if(option4()){ out.println(4); }
        else if(option5()){ out.println(5); }
        else if(option6()){ out.println(6); }
        else { out.println(7); }
        out.close();
    }
}
