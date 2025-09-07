class Rectangle
{
	// Length of this rectangle
    private double length;

	// Width of this rectangle
	private double width;

	// Set method for length
	public void setLength(double length) {
    this.length = length;
}

   //Get method for length
	public double getLength() {
    return length;

// --- Set method for width ---
public void setWidth(double width) {
    this.width = width;
}

// --- Get method for width ---
  public double getWidth() {
    return width;
	

	// Write the calculatePerimeter() and 
	// calculateArea() methods here	

   public double calculateArea() {
    return length * width;
}

	public double calculatePerimeter() {
    return 2 * (length + width);


}