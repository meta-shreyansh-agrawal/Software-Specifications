import java.lang.Math; 

public class Area{
    public double areaOfTriangle(double width,double height){
        return width * height * 0.50; 
    }
    
    public double areaOfRectangle(double width,double height){
        return width * height; 
    }

    public double areaOfSquare(double side){
        return side*side; 
    }

    public double areaOfCircle(double radius){
        return Math.PI * radius * radius; 
    }
    
}