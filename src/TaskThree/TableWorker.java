package TaskThree;

import java.util.ArrayList;

public class TableWorker {

    private final double A;
    private final double B;
    private final double STEP;
    private final ArrayList<TableCell> table = new ArrayList<>();

    TableWorker(double a, double b, double step) {
        A = a;
        B = b;
        STEP = step;
    }

    void createTable() {

        double functionValue;
        TableCell cell;
        for (double startPosition = A; startPosition <= B; startPosition += STEP) {
            functionValue = Math.tan(startPosition);
            cell = new TableCell(startPosition, functionValue);
            table.add(cell);
        }
    }

    void printTable() {
        System.out.println("Значение аргумента | Значение функции");
        TableCell cell;
        for (TableCell tableCell : table) {
            cell = tableCell;
            System.out.println(cell.getArgValue() + " | " + cell.getFunctionValue());
        }
    }

    class TableCell {
        private final double FUNCTION_VALUE;
        private final double ARG_VALUE;

        TableCell(double argValue, double functionValue) {
            ARG_VALUE = argValue;
            FUNCTION_VALUE = functionValue;
        }

        double getFunctionValue() {
            return FUNCTION_VALUE;
        }

        double getArgValue() {
            return ARG_VALUE;
        }
    }

}
