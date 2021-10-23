package Classes_and_Objects.TaskNine;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(22.123, ColorOfBall.BLUE);
        basket.addBall(11.83, ColorOfBall.RED);
        basket.addBall(12.243, ColorOfBall.GREEN);
        basket.addBall(13.19, ColorOfBall.BLUE);
        System.out.println("Общий вес мячей: " + basket.getTotalWeight());
        System.out.println("Количество синих мячей: " + basket.getSizeOfBlueBalls());
    }
}
