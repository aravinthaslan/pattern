import java.util.Scanner;
class Pattern3
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
                            if(i==j)
                                System.out.print("*");
                            else
                                System.out.print("0");
                        }
                    System.out.println();
                }
        }
}
