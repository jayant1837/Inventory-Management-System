import  java.util.*;
public class Tasks3 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=s.nextLine();

        System.out.println("Enter Your Age:");
        int age=s.nextInt();
	s.nextLine();

        System.out.println("Enter College Name:");
        String collegename=s.nextLine();

        System.out.println("Enter Branch:");
        String branch=s.nextLine();

        System.out.println("Enter City:");
        String city = s.nextLine();


        System.out.println("Student Information");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("College:"+collegename);
        System.out.println("Branch:"+branch);
        System.out.println("City:"+city);
        s.close();
    }
}
