import java.util.Scanner;

public class Q_2 
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        //Q.2.WAP to print triangle using star pattern programming logic
        System.out.println("Enter Size :");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i+j>=(n-1)/2 && i<(n-1)/2 && j<=(n-1)/2  || j-i<=(n-1)/2 && i<(n-1)/2 && j>=(n-1)/2 || i==(n-1)/2 && j<(n-1) )
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
