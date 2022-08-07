public abstract class shape {

    protected String color="red";
    protected boolean filled=true;

    public shape() {
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){


    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getarea();
    public abstract double getperimeter();
    public abstract String tostring();



}
