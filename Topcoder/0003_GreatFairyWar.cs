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
