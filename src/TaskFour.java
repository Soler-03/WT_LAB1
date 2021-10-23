import java.util.ArrayList;
import java.util.Scanner;

public class TaskFour {
    static ArrayList<Integer> indexesOfPrimeValues = new ArrayList<>();

    public static void main(String[] args) {
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива(N): ");
        N = Helper.receiveNumber(scan);
        int[] array = new int[N];
        Helper.fillArray(array);
        Helper.printArray(array);
        findSimpleElements(array);
        printIndexes();
    }



    private static void printIndexes() {
        System.out.print("Индексы простых чисел: ");
        for (Integer indexesOfPrimeValue : indexesOfPrimeValues) {
            System.out.print(indexesOfPrimeValue + " ");
        }
        System.out.println();
    }

    private static void findSimpleElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (checkPrime(array[i])) {
                indexesOfPrimeValues.add(i);
            }
        }
    }

    private static boolean checkPrime(int number) {
        boolean isPrime = true;
        int temp;
        int i = 2;
        while (i < number / 2 && isPrime) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }





}
