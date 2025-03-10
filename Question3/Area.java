import java.lang.Math; 

public class Area{

    /**
     * 
     * @param width of triangle in double value
     * @param height of triangle in double value
     * @return area of triangle in double
     */
    public double areaOfTriangle(double width,double height){
        return width * height * 0.50; 
    }
    
    /**
     * 
     * @param width of rectangle in double
     * @param height of rectangle in double
     * @return area of rectangle in double
     */
    public double areaOfRectangle(double width,double height){
        return width * height; 
    }

    /**
     * 
     * @param side of square in double
     * @return area of square in double
     */
    public double areaOfSquare(double side){
        return side*side; 
    }

    /**
     * 
     * @param radius of circle in double
     * @return area of circle with radius in double
     */
    public double areaOfCircle(double radius){
        return Math.PI * radius * radius; 
    }
    
}