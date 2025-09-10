// This program uses the programmer-defined Rectangle class. 

public class MyRectangleClassProgram
{
   public static void main(String args[])
   {
      //  Create two Rectangle objects using the default constructor
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        //  Set values for rectangle1
        rectangle1.setLength(10.0); 
        rectangle1.setWidth(5.0);   

        // Set values for rectangle2
        rectangle2.setLength(7.0);  
        rectangle2.setWidth(3.0);   

        // Print details for rectangle1
        System.out.println("Rectangle 1:");                 
        System.out.println("Length: " + rectangle1.getLength());     
        System.out.println("Width: " + rectangle1.getWidth());       
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter()); 
        System.out.println("Area: " + rectangle1.calculateArea());          

        System.out.println(); // Blank line to separate rectangles

        // Print details for rectangle2
        System.out.println("Rectangle 2:");               
        System.out.println("Length: " + rectangle2.getLength());     
        System.out.println("Width: " + rectangle2.getWidth());       
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Area: " + rectangle2.calculateArea());      git remote add origin https://github.com/cengage-csp-students-prod-3/9780357880876_pld-10e-java-e31fca6b-fde6-4f0f-b98c-028d7ee7d717.git      git add .
              git commit -m "Initial commit"            git commit -m "Initial commit"
}