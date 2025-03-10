import java.util.Scanner; 
import java.util.InputMismatchException;

public class Utils{
    public static double inputDouble(Scanner sc){
        double d = 0; 
        boolean isValid = false; 
        do{
            try{
                d = sc.nextDouble(); 
                if(d<0){
                    System.out.println("Enter value greater than 0"); 
                }else{
                    isValid = true; 
                }
            }catch(InputMismatchException e){
                System.out.println("Enter valid value"); 
            }
        }while(!isValid);
        return d; 
    }
    public static int inputNumberInRange(Scanner sc,int start,int end){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<start||num>end){
                    System.out.println("Enter number between "+start+" and "+end); 
                }else{
                    return num; 
                }
            }catch(InputMismatchException e){
                System.out.println("Enter valid Number"); 
            }
        }
    }
}