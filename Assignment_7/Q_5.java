import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        
        //Q.5.Write a program to print your Full Name using pattern programming logic


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)//G
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || i==(n-1) && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 && j>(n-1)/4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n; j++)//A
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }                
            }
            for(int j = 0; j<n; j++)//U
            {
                if(j==0 && i<n-1 || j==(n-1)/2 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }                
            }
            for(int j = 0; j<n; j++)//R
            {
                if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i<(n-1)/2 &&  i>0 || i==(n-1)/2 && j<(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }                
            }
            for(int j = 0; j<n; j++)//A
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }                
            }
            for(int j = 0; j<n; j++)//V
            {
                if(j==0 && i<=(n-1)/2 || j==n-1 && i<=(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2)
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
