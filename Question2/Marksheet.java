import java.util.ArrayList; 
import java.lang.Math; 

public class Marksheet{
    ArrayList<Integer> grades; 
    Marksheet(ArrayList<Integer> grades){
        this.grades = grades; 
    }

    public float average(){
        int sum = 0; 
        for(int num:this.grades){
            sum += num; 
        }
        try{
            float average = (float)(sum/this.grades.size()); 
        }catch(ArithmeticException e){
            System.out.println("Division by 0"); 
        }
        return average; 
    }
    public int maximum(){
        int max = 0; 
        for(int num: this.grades){
            max = Math.max(max,num); 
        }
        return max; 
    }
    public int minimum(){
        int min = 0; 
        for(int num: this.grades){
            min = Math.min(min,num); 
        }
        return min; 
    }
    public float studentsPassedPercentage(){
        int count = 0; 
        for(int num: this.grades){
            if(num>=40){
                count+=1; 
            }
        }
        try{
            float percentage = (count*100)/this.grades.size();
        }catch(ArithmeticException e){
            System.out.println("Division by 0"); 
        }
        return percentage; 
    }

}