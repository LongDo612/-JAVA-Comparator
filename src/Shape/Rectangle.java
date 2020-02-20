package Shape;

public class Rectangle extends Shape{
    double width = 1.0;
    double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "A rectangle with width=" +width+" and height="+height+", which is a subclass of "+super.toString();
    }
}
