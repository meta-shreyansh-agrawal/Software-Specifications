import java.util.Scanner; 
import java.util.InputMismatchException; 
public class Utils{
    public static int inputNumberInRange(Scanner sc,int start,int end){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<start||num>end){
                    throw new IllegalArgumentException(); 
                }else{
                    return num; 
                }
            }catch(InputMismatchException e){
                System.out.println("Enter valid Number"); 
            }catch(IllegalArgumentException e){
                System.out.println("Enter number between "+start+" and "+end); 
            }
        }
    }
    public static int inputNaturalNumber(Scanner sc){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<1){
                    throw new IllegalArgumentException(); 
                }else{
                    return num; 
                }
            }catch(InputMismatchException e){
                System.out.println("Enter valid Number"); 
            }catch(IllegalArgumentException e){
                System.out.println("Enter number greater than 0"); 
            }
        }
    }
}