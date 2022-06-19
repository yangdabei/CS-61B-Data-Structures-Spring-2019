public class HelloNumbers {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (y < 10) {
			x = x + y;
			System.out.print(x + " ");
			y = y + 1;
		}
		System.out.println();
	}
}