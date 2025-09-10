class Rectangle
{
	// Length of this rectangle
	// Width of this rectangle
	
	private double length;
    private double width;

	// Write set methods here
	
    public void setLength(double length) {
        this.length = length;
    }
	public void setWidth(double width) {
		this.width = width;
	}

	// Write get methods here

	public double getWidth() {
        return width;
	}
	public double getLength() {
		return length;
	}

	// Write the calculatePerimeter() and 
	// calculateArea() methods here	
	
	public double calculateArea() {
        return length * width;
    }
	public double calculatePerimeter() {
		return 2 * (length + width);
	
}