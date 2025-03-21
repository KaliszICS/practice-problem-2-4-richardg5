public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0; i < names.length - 1; i++) {
			int currLowest = i;
			for (int e = i; e < names.length; e++) {
				if (names[e].compareToIgnoreCase(names[currLowest]) < 0) {
					currLowest = e;
				}
			}
			String tempName = names[currLowest];
			names[currLowest] = names[i];
			names[i] = tempName;
			int tempAge = ages[currLowest];
			ages[currLowest] = ages[i];
			ages[i] = tempAge;
		}
	} 

	public static void selectionSortAge(String[] names, int[] ages) {
		for (int i = 0; i < ages.length - 1; i++) {
			int currLowest = i;
			for (int e = i; e < ages.length; e++) {
				if (ages[e] < ages[currLowest]) {
					currLowest = e;
				}
			}
			String tempName = names[currLowest];
			names[currLowest] = names[i];
			names[i] = tempName;
			int tempAge = ages[currLowest];
			ages[currLowest] = ages[i];
			ages[i] = tempAge;
		}
	}
}
