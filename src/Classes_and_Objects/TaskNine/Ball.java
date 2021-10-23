package Classes_and_Objects.TaskNine;

public class Ball {

    private ColorOfBall color;
    private double weight;

    Ball(double weight, ColorOfBall color) {
        this.weight = weight;
        this.color = color;
    }

    ColorOfBall getColor() {
        return color;
    }

    double getWeight() {
        return weight;
    }
}
