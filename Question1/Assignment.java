import java.util.Scanner;

public class Assignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice\n1)compare is equal strings\n2)reverse string\n3)replace lowercase characters with uppercase and vice-versa\n4) largest word of a string\n0)Exit");
            int choice = Utils.inputNumberInRange(sc, 0, 4); 
            String s1 = ""; 
            String s2 = ""; 
            switch (choice) {
                case 1:
                    System.out.println("Enter first string");
                    s1 = sc.nextLine(); 
                    System.out.println("Enter second string");
                    s2 = sc.nextLine();
                    System.out.println("Strings are equal: "+StringOperations.isEqual(s1, s2)); 
                    break;
                case 2: 
                    System.out.println("Enter string");
                    s1 = sc.nextLine();    
                    System.out.println("Reverse String: "+StringOperations.reverse(s1));
                    break;
                case 3: 
                    System.out.println("Enter string");
                    s1 = sc.nextLine();    
                    System.out.println("Modified String: "+StringOperations.replace(s1));
                    break;
                case 4: 
                    System.out.println("Enter string");
                    s1 = sc.nextLine();    
                    System.out.println("Largest Word: "+StringOperations.largestWord(s1));
                    break;
                case 0: 
                    sc.close();
                    return; 
                default:
                    break;
            }
        }
    }
}