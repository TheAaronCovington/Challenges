/*  DESCRIPTION: You are a wizard. You are facing N fairies, numbered 0 through N-1. Your goal is to defeat all of them. 
You can only attack one fairy at a time. Moreover, you must fight the fairies in order: you can only attack fairy X+1
after you defeat fairy X. On the other hand, all fairies that have not been defeated yet will attack you all the time.
Each fairy has two characteristics: her damage per second (dps) and her amount of hit points. Your damage per second is 1. 
That is, you are able to reduce an opponent's hit points by 1 each second. In other words, if a fairy has H hit points, it 
takes you H seconds to defeat her.
You are given two s, each of length N: dps and hp. For each i, dps[i] is the damage per second of fairy i, and hp[i] is her 
initial amount of hit points. We assume that your number of hit points is sufficiently large to avoid defeat when fighting 
the fairies. Compute and return the total number of hit points you'll lose during the fight. In other words, return the total
amount of damage the attacking fairies will deal.
*/
class GreatFairyWar{
	public int minHP(int[] dps, int[] hp) {
            int count = 0;
            for (int i = 0; i < dps.Length; i++) {
                count += dps[i];
            }
            int damage = 0;
            for (int i = 0; i < dps.Length; i++) {
                damage += hp[i] * count;
                count -= dps[i];
            }
            return damage; ;
        }
}
