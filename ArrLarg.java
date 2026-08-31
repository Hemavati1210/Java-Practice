import java.util.*;
class ArrLarg 
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
        int lar=a[0];
        for(int i=0;i<n;i++)
        {
            if(lar<a[i])
            {
                lar=a[i];
            }
        }
        System.out.println("LARGEST NUMBER ="+ lar);
    }
}        
