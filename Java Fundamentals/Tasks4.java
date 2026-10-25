import  javax.swing.*;
public class Tasks4 
{
    public static void main(String[] args) 
    {
        int Number1,Number2;
        Number1=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        Number2=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        System.out.println("Addition of two number is:"+(Number1+Number2));
        if(Number1>Number2)
        {
            System.out.println("Subtraction of two number is:"+(Number1-Number2));
        }
        else
        {
            System.out.println("Subtraction of two number is:"+(Number2-Number1));
        }
        System.out.println("Multiplication of two number is:"+(Number1*Number2));
        System.out.println("Division of two number is:"+(Number1/Number2));
        System.out.println("Modulus of two number is:"+(Number1%Number2));
    }
}
