public class TaskSix {
    static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        Helper.fillArray(array);
        int[][] matrix = new int[ARRAY_LENGTH][ARRAY_LENGTH];
        fillMatrix(array, matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            for (int j = 0; j < ARRAY_LENGTH; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[] array, int[][] matrix) {
        int startPosition = 0;
        int indexOfArray;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            for (int j = 0; j < ARRAY_LENGTH; j++) {
                indexOfArray = (startPosition + j) % ARRAY_LENGTH;
                matrix[i][j] = array[indexOfArray];
            }
            startPosition++;
        }
    }


}
