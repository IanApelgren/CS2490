/***
 *Troy Miller
 *Ian Apelgren
 *
 *ByBicycle - To implement this we would most likely just copy the Walking class because ByBicycle 
 *          needs all of the same methods and would work the same way. The only other thing to 
 *          change is there needs to be another if in the setter for "bike".
 */ 
public class Client {
    public static void main(String[] args) {
        Directions d1 = new Directions();
        Directions d2 = new Directions();
        Directions d3 = new Directions();
        d1.performDraw();
        d2.performDraw();
        d3.performDraw();
        d2.changeStrategy("walk");
        d3.changeStrategy("transit");
    }
}