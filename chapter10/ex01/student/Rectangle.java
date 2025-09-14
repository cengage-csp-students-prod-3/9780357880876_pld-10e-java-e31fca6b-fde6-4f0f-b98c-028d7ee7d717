public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    // ✅ SETTER for length
    public void setLength(double len) {
        length = len;
    }

    // ✅ GETTER for length
    public double getLength() {
        return length;
    }

    // Optional: Set and get methods for width (if needed)
    public void setWidth(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    // Optional: Methods to calculate area and perimeter
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
