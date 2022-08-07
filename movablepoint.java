public class movablepoint implements movable{
    int x;
    int y;
    int xspeed;
    int yspeed;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXspeed() {
        return xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    public void moveup(){

        y-=yspeed;

    }
    public void movedown(){

        y+=yspeed;

    }
    public void moveleft(){

        x-=xspeed;

    }
    public void moveright(){

        x+=xspeed;

    }

    public movablepoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "movablepoint{" +
                "x=" + x +
                ", y=" + y +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
}
