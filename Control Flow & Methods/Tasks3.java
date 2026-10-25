
import java.util.*;
public class Tasks3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a First Number");
        int num1=sc.nextInt();
        System.out.println("Enter a Second Number");
        int num2=sc.nextInt();
        Addition(num1,num2);
        Subtraction(num1,num2);
        Multiplication(num1,num2);
        Division(num1,num2);
        Modulus(num1,num2);
    }
    static void Addition(int num1,int num2)
    {
        int ans=num1+num2;
        System.out.println("Addition of Number is:"+ans);
    }
    static void Subtraction(int num1,int num2)
    {
        int ans;
        if(num1>num2)
        {
            ans=num1-num2;
            System.out.println("Subtractioni of Number is:"+ans);
        }
        else
        {
            ans=num2-num1;
            
        }
    }
    static void Multiplication(int num1,int num2)
    {
        int ans=num1*num2;
        
    }
    static void Division(int num1,int num2)
    {
        int ans=num1/num2;
        System.out.println("Division of Number is:"+ans);
    }
    static void Modulus(int num1,int num2)
    {
        int ans=num1%num2;
        System.out.println("Modulus of Number is:"+ans);
    }
}
