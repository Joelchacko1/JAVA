import java.util.Scanner;
public class MatrixCalculation3 {
    public static void main(String[] args) throws Exception{
        int i,j;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of identity matrix:");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for( i=0;i<n;i++){
            for( j=0;j<n;j++){
                if(i==j){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=0;
                }
            }
        }
        System.out.println("the identity  matrix is :");
        System.out.println("The matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
    
            }
    System.out.print("\n");
    
        }
       
}
}
