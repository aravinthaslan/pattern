import java.util.Scanner;
class Pattern9
{   
    public static void main(String args[])
    {
    int i,n=4,j,k,z=1;
    Scanner s=new Scanner(System.in);
    for(i=1;i<=n;i++)
    {
        for(j=n-1;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=1;k<=z;k++)
        {
            System.out.print(j);
        }
        z=z+2;
         System.out.println();
    }
    }
}
