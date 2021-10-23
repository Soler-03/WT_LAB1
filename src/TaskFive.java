import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну масива: ");
        int n = Helper.receiveNumber(scan);
        System.out.println("Please, enter array");
        int[] array = new int[n];
        Helper.fillArray(array);

        try {

            System.out.println("Min Amount for extracting: " + getMinElements(array));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getMinElements(int[] sequence) {

        int maxIncLen = 0, curInLen;
        boolean isIncrease;

        for (int i = 0; i < sequence.length; i++) {
            isIncrease = true;
            curInLen = 1;
            for (int j = i + 1; (j < sequence.length) && isIncrease; j++) {
                if (sequence[j - 1] < sequence[j]) {
                    curInLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncLen = Math.max(maxIncLen, curInLen);
        }
        return sequence.length - maxIncLen;
    }
}
