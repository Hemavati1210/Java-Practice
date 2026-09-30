public class DigRep 
{
    public static void main(String[]args)
    {
         int a[]=new int[6];
         a[0]=1;
         a[1]=2;
         a[2]=2;
         a[3]=3;
         a[4]=4;
         a[5]=4;
         for(int i=0;i<a.length;i++)
            {
                int count=0;
                for(int j=0;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                    }   
                }
                System.out.println(a[i]+":"+count);     
            } 
    }
    
}
