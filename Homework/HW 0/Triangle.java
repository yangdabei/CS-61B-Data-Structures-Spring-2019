public class Triangle {
    public static void main(String[] args) {
        int row = 1;

        int size = 5;
        while (row <= size) {
            int col = 1;
            while (col <= row) {
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }

}
