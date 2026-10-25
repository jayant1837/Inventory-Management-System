
public class Tasks4 
{
    public static void main(String[] args) {
        System.out.println("Square="+square(5));
        System.out.println("Cube="+cube(3));
        System.out.println("Average="+average(10,20,30));
        System.out.println("Maximum="+maximum(15,25));
    }
    static int square(int n)
    {
        return n*n;
    }
    static int cube(int n)
    {
        return n*n*n;
    }
    static double average(int a, int b, int c)
    {
        return (a+b+c)/3.0;
    }
    static int maximum(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
