/*  DESCRIPTION:   The sortness of a sequence of distinct numbers is the average of the sortness of each element. The 
sortness of an element is the number of higher elements that come before it in the sequence plus the number of lower
elements that come after it in the sequence. The lower the sortness of a sequence, the closer it is to being sorted. 
Only a sorted sequence has a sortness of 0.
For example, in the sequence {3,2,1,4,6,7,5,8} the numbers 1,2,3 and 5 have a sortness of 2, numbers 6 and 7 have a sortness 
of 1 and numbers 4 and 8 have a sortness of 0. The sortness of the sequence is the average of all those sortness values: 
(2+2+2+2+1+1+0+0)/8 = 1.25.
You will be given a sequence of distinct numbers a as a int[]. Return the sortness of a. 
*/
class Sortness{
		public double getSortness(int[] a) {
            double total = 0; double count = 0;
            for (int i = 0; i < a.Length; i++) {
                for (int j = 0; j < a.Length; j++) {
                    if (a[i] > a[j] && i < j) {
                        count++;
                    }
                    else if (a[i] < a[j] && i > j) {
                        count++;
                    }
                }
                total += count;
                count = 0;
            }
            return total / a.Length;
        }
}
