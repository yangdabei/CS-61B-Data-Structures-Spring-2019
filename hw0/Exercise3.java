public class Exercise3 {
    public static int max(int[] m) {
        int current = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > current) {
                current = m[i];
            }
        }
        return current;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}
