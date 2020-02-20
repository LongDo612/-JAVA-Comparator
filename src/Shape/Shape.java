package Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        if (filled)
            return "A shape with color of " + this.color + " and filled";
        else
            return "A shape with color of " + this.color + " and not filled";
    }

}
