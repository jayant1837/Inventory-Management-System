import java.util.*;
public class Tasks6 
{
    public static void main(String[] args) {
        int Arr[][]=new int[3][3];
        int sum=0;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                System.out.print("Enter element in array:");
                Arr[i][j]=input.nextInt();
                sum=sum+Arr[i][j];
            }
            System.out.println("");
        }
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sum of all element:"+sum);
    }
}
