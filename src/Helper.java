import java.util.Scanner;

public class Helper {
    public static int receiveNumber(Scanner scan) {
        int receivingNumber;
        while (!scan.hasNextDouble()) {
            System.out.println("Ошибка! Повторите ввод");
            scan.next();
        }
        receivingNumber = scan.nextInt();
        return receivingNumber;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
