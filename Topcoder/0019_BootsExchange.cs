/*  DESCRIPTION:  A boot shop has received a shipment from the factory consisting of N left boots and N right boots. Each boot
has some integer size, and a left and right boot will form a proper pair if they have equal sizes. Each boot can only belong
to a single pair. The employees of the boot store want to create N proper pairs of boots. Fortunately, the factory has offered
to exchange any number of boots in the shipment with new boots of different sizes.
You are given a left and a right containing the sizes of the left boots and right boots, respectively. Return the least number 
of boots that must be exchanged.
*/
using System.Collections.Generic;
class BootsExchange{
		public int leastAmount(int[] left, int[] right) {
            int N = left.Length;
            var set1 = new HashSet<int>(left);
            var set2 = new HashSet<int>(right);
            set1.IntersectWith(set2);
            return N-set1.Count;
        }
}
