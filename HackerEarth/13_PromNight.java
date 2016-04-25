/* DESCRIPTION:  This program works by taking input T for the number of test cases and then N and M for
                  the number of boys and girls respectively.  It then reads in the heights of the boys
                  and girls and adds them to lists.  We then sort them and run a loop comparing the size of the 
                  shortest boy to the shortest girl and if the boys height is greater then we remove both from the 
                  list.  Otherwise we print "NO" and continue to the next test case.  If all boys have been removed
                  from the list we print "YES" because they all have a girl to dance with thats shorter than them. 
   LINK: https://www.hackerearth.com/problem/algorithm/prom-night/description/
*/
import java.util.Scanner;
import java.util.Collections;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
		while(T > 0){
			int N = input.nextInt();
			int M = input.nextInt();
			List<Integer> boys = new ArrayList<Integer>();
			List<Integer> girls = new ArrayList<Integer>();		
			for(int i = 0; i < N; i++){
				boys.add(input.nextInt());
			}
			for(int i = 0; i < M; i++){
				girls.add(input.nextInt());
			}
			Collections.sort(boys);
			Collections.sort(girls);
			for(int i = 0; i < N; i++){
				if(boys.get(0) > girls.get(0)){
					boys.remove(0);
					girls.remove(0);
					if(boys.size() == 0){
						System.out.println("YES");
					}
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			T--;
		}
   }
}
