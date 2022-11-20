import java.util.Scanner; 
public class Matrix
{
    public static void main()
    {
        int i,j;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the row size of matrix");
        int row= sc.nextInt();
        System.out.println("Enter the colomn size of matrix");
        int colomn= sc.nextInt();
        int matrix[][]=new int[row][colomn]; // declaration of 2D array.
        System.out.println("Enter the elements to be printed");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
               matrix[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

   
}
