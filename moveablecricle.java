public class moveablecricle implements movable{
    private int radius;
    private movablepoint centre;

    public moveablecricle(int radius, movablepoint centre) {
        this.radius = radius;
        this.centre = centre;
    }

    public void moveup(){

    }
    public void movedown(){

    }
    public void moveleft(){

    }
    public void moveright(){

    }

    @Override
    public String toString() {
        return "moveablecricle{" +
                "radius=" + radius +
                ", centre=" + centre +
                '}';
    }
}
