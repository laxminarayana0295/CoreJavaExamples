package strings;

public class swappingCharsInString {
	public static char[] swap(String string, int i, int j) {
		char chr[] = string.toCharArray();
		char temp = chr[i];
		chr[i] = chr[j];
		chr[j] = temp;
		return chr;
	}

	public static void main(String args[]) {
		String str = "Know Program";
		System.out.println(str);
		System.out.println(swap(str, 0, 5));
	}
}