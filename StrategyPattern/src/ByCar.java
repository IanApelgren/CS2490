
import java.util.Random;
public class ByCar implements TravelStrategy {
    Random r = new Random();
    double rand = 1001 * r.nextDouble();
    public void drawMap() {
        System.out.println("Map for travelling by car");
    }
    public void findRoute() {
        System.out.println("Your distance by car is: " + rand);
    }
    public void computeTimeEstimate() {
        System.out.println("car Time estimate bleep bloop");
    }
    public void savings() {
        double c02 = rand * 404;
        System.out.println("No savings. You will emit " + c02 + " grams of CO2 into the atmosphere.");
    }
}
