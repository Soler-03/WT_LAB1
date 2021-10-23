package TaskThree;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        double a, b, step;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите начальное значение промежутка(a): ");
        a = receiveNumber(scan);
        System.out.print("Введите конечное значение промежутка(b): ");
        b = receiveNumber(scan);
        System.out.print("Введите значение шага(h): ");
        step = receiveNumber(scan);

        TableWorker tableWorker = new TableWorker(a, b, step);
        tableWorker.createTable();
        tableWorker.printTable();
        scan.close();
    }

    private static double receiveNumber(Scanner scan) {
        double receivingNumber;
        while (!scan.hasNextDouble()) {
            System.out.println("Ошибка! Повторите ввод");
            scan.next();
        }
        receivingNumber = scan.nextDouble();
        return receivingNumber;
    }


}
