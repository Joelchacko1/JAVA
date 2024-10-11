package oopj24csb42;
import java.util.Scanner;
public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column of matrix a:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the row and column of matrix b:");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		if(c1!=r2){
			System.out.println("The combination of matrix is not possible for multiplication");
			return ;
		}
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r2][c1];
			System.out.println("Enter the elements of matrix A:");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					a[i][j]=sc.nextInt();
				}
			
		}
			System.out.println("Enter the elements of matrix B:");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					b[i][j]=sc.nextInt();
				}
			
		}
			System.out.println("multiplication of matrix A and B:");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c1;j++) {
					for(int k=0;k<c2;k++) {
					c[i][j]=a[i][k]*b[k][j];
					System.out.print(+c[i][j]+" ");
				}
			
					}
				System.out.print("\n");
				}
		
         
				
	}

}
