public class TriangleMethod {
    public static void drawTriangle(int N) {
        int row = 1;

        int size = N;
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

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
