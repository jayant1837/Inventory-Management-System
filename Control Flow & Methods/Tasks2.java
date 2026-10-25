public class Tasks2 
{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i;
            System.out.print(i+" ");
        }
	System.out.println("\n"+"----------------------------");
	for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.print(" Even:"+i);
            }
        }
	System.out.println("\n"+"----------------------------");
	for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.print(" Odd:"+i);
            }
        }
	System.out.println("\n"+"----------------------------");
        System.out.println("Sum of all Number between 1 to 100:"+sum);
    }
}
