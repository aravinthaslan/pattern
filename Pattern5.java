import java.util.Scanner;
class Pattern5
{
     public static void main(String args[])
    {
    int n,i,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
    for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
              {
                if(i==1||i==5||j==1||j==5)
                       System.out.print("*");
                else
                    System.out.print("#");
                }
          System.out.println(); 
        }
   }
}
