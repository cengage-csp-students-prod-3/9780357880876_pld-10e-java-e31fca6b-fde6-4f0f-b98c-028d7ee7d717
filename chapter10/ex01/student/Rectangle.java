public class Rectangle {
    private double length;
    private double width;

  

    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

  
    public void setLength(double len) {
        length = len;
    }

  
    public double getLength() {
        return length;
    }

    
    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
