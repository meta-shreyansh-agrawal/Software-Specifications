import java.util.Scanner; 
public class Assignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area area = new Area(); 
        while(true){
            System.out.println("Enter choice to Calculate Area of\n1)Triangle\n2)Rectangle\n3)Square\n4)Circle\n0)Exit Program"); 
            int choice = Utils.inputNumberInRange(sc,0,4);
            double height; 
            double width; 
            double side; 
            double radius; 
            switch(choice){
                case 1: 
                    System.out.print("Enter\nHeight: "); 
                    height = Utils.inputDouble(sc); 
                    System.out.print("Width: "); 
                    width = Utils.inputDouble(sc); 
                    System.out.println("Area of Triangle is: "+area.areaOfTriangle(height,width)); 
                    break; 
                case 2: 
                    System.out.print("Enter\nHeight: "); 
                    height = Utils.inputDouble(sc); 
                    System.out.print("Width: "); 
                    width = Utils.inputDouble(sc); 
                    System.out.println("Area of Rectangle is: "+area.areaOfRectangle(height,width)); 
                    break; 
                case 3: 
                    System.out.print("Enter\nSide: "); 
                    side = Utils.inputDouble(sc); 
                    System.out.println("Area of Square is: "+area.areaOfSquare(side)); 
                    break; 
                case 4: 
                    System.out.print("Enter\nRadius: "); 
                    radius = Utils.inputDouble(sc); 
                    System.out.println("Area of Circle is: "+area.areaOfCircle(radius)); 
                    break; 
                case 0: 
                    sc.close(); 
                    return; 
            } 
        }        
    }
}