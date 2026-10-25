/*what is Type Casting:- Converting one datatype to another datatype is called type casting
there are two type 
1)Implicit Type Casting:- it automatically performed by the compiler
2)Explicit Type Casting:- by default the comipler doesn't allow the explicit type casting*/
import javax.swing.*;
public class Tasks6 
{
    public static void main(String[] args) 
    {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer value"));
        float b=Float.parseFloat(JOptionPane.showInputDialog("Enter a float value"));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Enter a double value"));
        System.out.println("Integer value"+a);
        System.out.println("Float vallue"+b);
        System.out.println("Double value"+c);
        //Implicit Type Casting
        System.out.println("Implicit Type Casting");
        System.out.println("value before Type casting"+"\n"+a+"\n"+b+"\n"+c);
        System.out.println("value after type casting");
        double x=a;
        System.out.println("integer to double:"+x);
        //Explicit Type Casting
        System.out.println("Explicit Type Casting");
        System.out.println("value before Type casting"+"\n"+a+"\n"+b+"\n"+c); 
        int y=(int)c;
        float f=(float)y;
        System.out.println("value after type casting");
        System.out.println("double to integer"+y);
        System.out.println("integer to float"+f);
    }
}
