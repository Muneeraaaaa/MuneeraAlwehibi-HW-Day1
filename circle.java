public class circle implements Geometric{

    protected double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }

    public double getperimeter(){

        return radius*2;
    }

    public double getarea(){

        double pi=3.12;
        return pi*radius*radius;
    }
}
