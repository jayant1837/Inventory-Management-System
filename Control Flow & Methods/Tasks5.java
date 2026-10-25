import java.util.*;
public class Tasks5 
{
    public static void main(String[] args) {
        int Marks[]=new int[5];
        int Total_marks=0,Average_marks,Highest_marks=0,Lowest_marks=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<Marks.length;i++)
        {
            System.out.print("Enter Student Marks:");
            Marks[i]=sc.nextInt();
            Total_marks=Total_marks+Marks[i];
            if(i==0)
            {
                Highest_marks=Lowest_marks=Marks[i];
            }
            if(Marks[i]>Highest_marks)
            {
                Highest_marks=Marks[i];
            }
            if(Marks[i]<Lowest_marks)
            {
                Lowest_marks=Marks[i];
            }
        }
        for(int i:Marks)
        {
            System.out.print(i+" ");
        }
        Average_marks=Total_marks/5;
        System.out.println("Lowest marks:"+Lowest_marks);
        System.out.println("Highest marks:"+Highest_marks);
        System.out.println("Total_marks:"+Total_marks);
        System.out.println("Average marks:"+Average_marks);
        
    }
}
