import java.util.Scanner;

class Q_1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Q.1. WAP to print Alphabets A, B, C, D, E, F, G, H, using pattern programming logic.
        System.out.println("Enter Size :");
        int n = sc.nextInt();
        
        //For 'A' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=n-1 && j<(n-1)/2)
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
        System.out.println();
        //For 'B' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j<(n-1)/2 || j==0 && i<=n-1|| i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==(n-1)/2 && j<(n-1)/2)
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

        //For 'C' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || i==n-1 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1)
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

        //For 'D' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==0 && i<n-1 || j==(n-1)/2 && i<n-1 && i>0)
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


        //For 'E' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==0 && i<n-1 || i==(n-1)/2 && j<(n-1)/2)
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
        //For 'F' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j<(n-1)/2 || j==0 && i<n-1 || i==(n-1)/2 && j<(n-1)/2)
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
        //For 'G' : 
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || i==n-1 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==(n-1)/2 && j>1 && j<(n-1)/2)
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
         //For 'H' : 
         for(int i=0; i<=n; i++)
         {
             for(int j=0; j<=n; j++)
             {
                 if(j==0 || i==(n-1)/2 && j<(n-1)/2|| j==(n-1)/2 )
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