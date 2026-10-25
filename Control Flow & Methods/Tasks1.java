import java.util.*;
public class Tasks1 
{
    public static void main(String[] args) {
        int English,Math,Hindi;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name");
        String name=sc.nextLine();
        System.out.print("Enter English marks");
        English=sc.nextInt();
        System.out.print("Enter Math marks");
        Math=sc.nextInt();
        System.out.print("Enter Hindi marks");
        Hindi=sc.nextInt();
        int Total_marks=English+Math+Hindi;
        float percentage=Total_marks/3;
        if(percentage>=28 && percentage<38)
        {
            System.out.println("Student Name"+name);
            System.out.println("Total Marks"+Total_marks);
            System.out.println("Percentage"+percentage);
            System.out.println("Grade D");
        }
        else if(percentage>=38 && percentage<50)
        {
            System.out.println("Student Name"+name);
            System.out.println("Total Marks"+Total_marks);
            System.out.println("Percentage"+percentage);
            System.out.println("Grade C");
        }
        else if(percentage>=50 && percentage<85)
        {
            System.out.println("Student Name"+name);
            System.out.println("Total Marks"+Total_marks);
            System.out.println("Percentage"+percentage);
            System.out.println("Grade B");
        }
        else if(percentage>=85 && percentage<=100)
        {
            System.out.println("Student Name"+name);
            System.out.println("Total Marks"+Total_marks);
            System.out.println("Percentage"+percentage);
            System.out.println("Grade A");
        }
        else
        {
            System.out.println("Student Name"+name);
            System.out.println("Total Marks"+Total_marks);
            System.out.println("Percentage"+percentage);
            System.out.println("Grade Fail");
        }
    }
}
