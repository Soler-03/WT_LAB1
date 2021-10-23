import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = Helper.receiveNumber(scan);
        System.out.print("Введите значение y: ");
        y = Helper.receiveNumber(scan);
        boolean result = checkAffiliation(x, y);
        System.out.print("Результат принадлежности: " + result);
        scan.close();
    }




    private static boolean checkAffiliation(int x, int y) {
        boolean result = false;

        if ((x <= 4 && x >= -4) && (y >= 0 && y <= 4)) {
            result = true;
        }

        if ((x <= 6 && x >= -6) && (y >= -3 && y <= 0)) {
            result = true;
        }

        return result;
    }


}
