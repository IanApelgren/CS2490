import java.util.Random;
public class MassTransit implements TravelStrategy {
    Random r = new Random();
    double rand = 1001 * r.nextDouble();
    public void drawMap() {
        System.out.println("Map for travelling by mass transit");
    }
    public void findRoute() {
        System.out.println("Your mass transit distance is: " + rand  );
    }
    public void computeTimeEstimate() {
        System.out.println("mass transit Time estimate bleep bloop");
    }
    public void savings() {
        double c02 = rand * .45;
        System.out.println("You will save 45% of the CO2 that would have been emitted by driving a car. You will keep " + c02 + " grams of CO2 out of the atmosphere.");
    }
}