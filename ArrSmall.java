import java.util.*;
class ArrSmall 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sma=a[0];
        for(int i=0;i<n;i++)
        {
            if(sma>a[i])
            {
                sma=a[i];
            }
        }
        System.out.println("SMALLEST NUMBER ="+ sma);
    }
} 