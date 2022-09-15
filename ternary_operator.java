import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        // if(marks>=40)
        // marks=marks+10;
        // if(marks<40)
        // marks=marks+20;
        
        
        marks=(marks>=40)? (marks+10) : (marks+20);
        System.out.print(marks);
    }
}