import java.util.*;
class EvenOdd 
{
    public static void main(String[]args)
    {
        Scanner st=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a =st.nextInt();
        if(a%2==0)
        {
            System.out.println("THE NUMBER IS EVEN");
        }
        else
        {
            System.out.println("THE NUMBER IS ODD");
        }    
    }
}