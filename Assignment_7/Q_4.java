import java.util.Scanner;

public class Q_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        //Q.4.Write a program to print PW SKILLS using pattern programming logic.
        
        System.out.println("Enter Size :");
        int n = sc.nextInt(); 
        for(int i=0; i<=n; i++)
        {
           for(int j=0; j<=n; j++)
           {
               if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i<(n-1)/2 && i>0) //P
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }
           }
           for(int j = 0; j<n; j++)
            {
                if(i==j && i>=(n-1)/2 || i+j==n-1 && i>=(n-1)/2 || j==0 || j==(n-1) ) //W
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("      ");
            for(int j = 0; j<n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i<(n-1)/2 && i>0|| i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1|| i==n-1 && j<(n-1)/2 ) //S
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j<n; j++)
            {
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) //K
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j<n; j++)
            {
                if(j==(n-1)/4 && i<n-1 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2) //I
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j<n; j++)
            {
                if(j==0 && i<n-1|| i==n-1 && j<(n-1)/2) //L
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j<n; j++)
            {
                if(j==0 && i<n-1 || i==n-1 && j<(n-1)/2) //L
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j<n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i<(n-1)/2 && i>0|| i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1|| i==n-1 && j<(n-1)/2 ) //S
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        

    }
}
