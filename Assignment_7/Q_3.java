import java.util.Scanner;

public class Q_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

/*

Q.3.WAP to print this pattern

* * * * * * * * * * * * * * *   
* * * * * * *     * * * * * *   
* * * * * *         * * * * *   
* * * * *             * * * *   
* * * *                 * * *   
* * *                     * *   
* *                         *   
*                           *   
*                           *   
*                           *   
*                           *   
*                           *   
*                           *   
*                           *   
* * * * * * * * * * * * * * * 

*/
         //int n = sc.nextInt(); 
         int n = 15;
         for(int i=0; i<=n; i++)
         {
            for(int j=0; j<=n; j++)
            {
                if(i+j<=(n-1)/2 || j-i>(n-1)/2 && j<n-1 || j==0 && i<=n-1 || j==n-1 && i<=n-1 || i==n-1 && j<n-1 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
}
