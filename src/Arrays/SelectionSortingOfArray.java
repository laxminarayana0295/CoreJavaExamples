package Arrays;

public class SelectionSortingOfArray {

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int min = 0, temp;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

	}

}