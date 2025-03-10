import java.util.Scanner; 
import java.util.ArrayList; 

public class Assignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> grades = new ArrayList<>(); 
        System.out.print("Enter number of Students: "); 
        int studentCount = Utils.inputNaturalNumber(sc); 
        for(int i = 0;i<studentCount;i++){
            System.out.print("Enter grade for student "+i+": "); 
            int grade = Utils.inputNumberInRange(sc,0,100); 
            grades.add(grade); 
        }
        Marksheet m = new Marksheet(grades); 
        int choice = 1; 
        while(true){
            System.out.println("Enter choice to get\n1)Average grade\n2)Maximum Grade\n3)Minimum Grade\n4)Percentage of students passed\n0)Exit"); 
            choice = Utils.inputNumberInRange(sc,0,4); 
            switch(choice){
                case 1: 
                    System.out.println("Average grade is: "+m.average()); 
                    break; 
                case 2: 
                    System.out.println("Maximum grade is: "+m.maximum()); 
                    break; 
                case 3: 
                    System.out.println("Minimum grade is: "+m.minimum()); 
                    break; 
                case 4: 
                    System.out.println("Percentage of Students passed is: "+m.studentsPassedPercentage()); 
                    break; 
                case 0: 
                    sc.close(); 
                    return; 
            }
        }
    }
}