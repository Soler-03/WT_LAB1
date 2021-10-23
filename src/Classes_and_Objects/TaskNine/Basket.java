package Classes_and_Objects.TaskNine;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> basket = new ArrayList<>();

    void addBall(double ballWeight, ColorOfBall ballColor) {
        basket.add(new Ball(ballWeight, ballColor));
    }

    private double calculateTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : basket) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    double getTotalWeight() {
        return calculateTotalWeight();
    }

    int getSizeOfBlueBalls() {
        return calculateSizeOfBlueBalls();
    }

    private int calculateSizeOfBlueBalls() {
        int sizeOfBlueBalls = 0;
        for (Ball ball : basket) {
            if (ball.getColor() == ColorOfBall.BLUE)
                sizeOfBlueBalls++;
        }
        return sizeOfBlueBalls;
    }
}
