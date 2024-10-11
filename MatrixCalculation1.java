import java.util.Scanner;
public class MatrixCalculation1 {
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner (System.in);
    int i,j;
    System.out.println("Enter the number of row in the matrix:");
    int r=sc.nextInt();
    System.out.println("Enter the number of column in matrix:");
    int c=sc.nextInt();
    int[][] a=new int[r][c];
    System.out.println("Enter the elements of matrix:");
    for(i=0;i<c;i++){
        for(j=0;j<r;j++){
           
            a[i][j]=sc.nextInt();

           
        }
    }
    System.out.println("The matrix is:");
    for(i=0;i<c;i++){
        for(j=0;j<r;j++){
            System.out.print(a[i][j]+"\t");

        }
System.out.print("\n");

    }
    System.out.println("Maximum Element in the row");
    for(i=0;i<c;i++){
        int max=a[i][0];
        for(j=0;j<r;j++){
            if(a[i][j]>max){
                max=a[i][j];
            }
        }
        System.out.println("row"+(i+1)+"="+max);

    }


}
    
}
