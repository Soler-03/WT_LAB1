public class TaskSeven {
    static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        Helper.fillArray(array);
        Helper.printArray(array);
        sortArray(array);
        Helper.printArray(array);
    }


    private static void sortArray(int[] array) {
        int i, j;
        int tmp;
        for (int step = ARRAY_LENGTH / 2; step > 0; step /= 2)
            for (i = step; i < ARRAY_LENGTH; i++) {
                tmp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = tmp;
            }
    }

}
