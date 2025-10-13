/**
 *This TriangleDriver program is for Midterm Exam Prep.
 *
 * @author Janhavi Jere
 * @version 1.0
 * @since 10/12/2025
 */


import java.util.Scanner;


public class Triangle{
    private String name;
    private double base, height;
    
    public Triangle()
    {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }
    
    
    
    /**
     *
     * @param inName:  this is the name of the triangle
     * @param inBase:  this is the base dimension of the triangle
     * @param inHeight: this is the height dimension of the triangle
     */
    
    public Triangle(String inName, double inBase, double inHeight){
    name = inName;
    base = inBase;
    height = inHeight;
    }

   
    /**
     * @param newName: this is the new name for the triangle
     */
    public void setName(String newName){
    name = newName;
    }
    
    
    /**
     * @param newBase: this is the new base for the triangle
     */
       public void setBase(double newBase){
    base = newBase;
    }
    
    
    /**
     * @param newHeight: this is the new height for the triangle
     */
       public void setHeight(double newHeight){
    height = newHeight;
    }
    
    
    
    public void readInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the triangle's name?: ");
        name = input.nextLine();

        System.out.print("What is the triangle's base?: ");
        base = input.nextDouble();

        System.out.print("What is the triangle's height?: ");
        height = input.nextDouble();
    }

   
    public void writeOutput() {
        System.out.printf("Triangle's name is: %s%n", name);
        System.out.printf("Triangle's base is: %.1f%n", base);
        System.out.printf("Triangle's height is: %.1f%n", height);
        System.out.printf("Triangle's area is: %.1f%n", getArea());
    }
    
    
    /**
     * @return gives the area of the triangle as a double
     */
     private double getArea() {
        return 0.5 * base * height;
    }
    
}