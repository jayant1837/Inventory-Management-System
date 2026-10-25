/*what is Type Casting:- Converting one datatype to another datatype is called type casting
there are two type 
1)Implicit Type Casting:- it automatically performed by the compiler
2)Explicit Type Casting:- by default the comipler doesn't allow the explicit type casting*/
public class Tasks5 
{
    public static void main(String[] args) 
    {
        //Implicit Type Casting
        int a=10;
        System.out.println("value of a before type casting:"+a);
        double b=a;
        System.out.println("value of a after type casting integer to double:"+b);
        //Explicit Type Casting
        double x=10.5;
        System.out.println("value of x before type casting:"+x);
        int y=(int)x;
        System.out.println("value of x before type casting double to integer:"+y);
        
    }
}
