import java.util.Random;
public class Walking implements TravelStrategy {
    Random r = new Random();
    double rand = 1001 * r.nextDouble();
    public void drawMap() {
        System.out.println("Map for travelling by walking");
    }
    public void findRoute() {
        System.out.println("Your distance by walking is: " + rand);
    }
    public void computeTimeEstimate() {
        System.out.println("walk Time estimate bleep bloop");
    }
    public void savings() {
        double c02 = rand * 404;
        System.out.println("100% savings. You kept " + c02 + " grams of CO2 out of the atmosphere. Besides that, you are healthier for it.");
    }
}