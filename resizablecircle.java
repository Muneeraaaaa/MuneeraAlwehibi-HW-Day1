public class resizablecircle extends circle implements resizable{

    public resizablecircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "resizablecircle{" +
                "radius=" + radius +
                '}';
    }

    public void resize(int percente){

        radius=radius*(percente/100.0);

        System.out.println(radius);

    }


}
