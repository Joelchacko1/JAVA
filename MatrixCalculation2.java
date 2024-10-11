import java.util.Scanner;
public class MatrixCalculation2 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner (System.in);
        int i,j;
        System.out.println("Enter the number of rows in the matrix:");
        int r=sc.nextInt();
        System.out.println("Enter the number of colums in matrix:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               
                a[i][j]=sc.nextInt();
    
               
            }
        }
        System.out.println("The matrix is:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");
    
            }
    System.out.print("\n");
    
    }
    System.out.println("Enter scalar value to multiply the Matrix:");
    int s=sc.nextInt();
    System.out.println("The resulting matrix after scalar multipilcation :");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            a[i][j]=a[i][j]*s;
            System.out.print(a[i][j]+"\t");

        }
        System.out.print("\n");
        sc.close();

    }
   
    
}
}
