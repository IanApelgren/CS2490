public class Directions {
    TravelStrategy travelStrategy;
    double routeDistance;
    
    public Directions() {
        travelStrategy = new ByCar();
        travelStrategy.findRoute();
        travelStrategy.computeTimeEstimate();
        travelStrategy.savings();
    }

    public void performDraw() {
        travelStrategy.drawMap();
    }

    public void performFindRoue() {
        travelStrategy.findRoute();
    }

    public void changeStrategy(String s) {
        if (s == "walk") {
            travelStrategy = new Walking();
        }
        if (s == "transit") {
            travelStrategy = new MassTransit();
        }
        else if (s == "car") {
            travelStrategy = new ByCar();
        }
        travelStrategy.findRoute();
        travelStrategy.computeTimeEstimate();
        travelStrategy.savings();
    }
}