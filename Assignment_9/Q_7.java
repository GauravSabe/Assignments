public class Q_7 
{
    public static void main(String[] args) 
    {   
        //Q.7.Write a program on a 2D array ?

        //Q.Addition of 2 array

        int row = 2 , column = 3;
        int a[][] = {{1,2,3} , {4,5,6}};
        int b[][] = {{1,2,3} , {4,5,6}};
        int c[][] = new int[row][column];
        
        System.out.println("display first array");
        for(int x[] : a)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        System.out.println("display second array");
        for(int x[] : b)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        //Logic to Add of 2 array
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        } 
        System.out.println("display Addition of 2 array");  
        for(int x[] : c)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }   
}