import java.util.Scanner;
public class MatrixCalculation4 {
    public static void main(String[] args) throws Exception{
        int i,j,flag=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of matrix:");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
    System.out.println("Enter the elements of matrix:");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
           
            a[i][j]=sc.nextInt();

           
        }
    }
    System.out.println("The matrix is:");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            System.out.print(a[i][j]+"\t");

        }
System.out.print("\n");

    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(a[i][j]==a[j][i]){
                flag=1;
            }
        }
   }
   if(flag==1){
   System.out.println("The matrix is sysmetric");
    }
    else{
        System.out.println("the matrix is not sysmetric");
    
    }

    
}
}
