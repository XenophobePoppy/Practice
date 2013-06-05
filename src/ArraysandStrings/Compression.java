package ArraysandStrings;
public class Compression{
	public static void reverse(int[][] matrix){
		int n=matrix.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n/2;j++){
				int temp=matrix[i][n-j-1];
				matrix[i][n-j-1]=matrix[i][j];
				matrix[i][j]=temp;
			}
		}
	}
	
	public static void tranpose(int[][] matrix){
		int n=matrix.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	
	public static void rotate90(int[][] matrix){
		
		tranpose(matrix);
		reverse(matrix);
	}
	
	public static void rotate180(int[][] matrix){
		tranpose(matrix);
		reverse(matrix);
		reverse(matrix);
	}
	
	public static void print(int[][] matrix){
		int n=matrix.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		int[][] matrix={
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};	
		rotate90(matrix);
		print(matrix);
		System.out.println();
		rotate180(matrix);
		print(matrix);
	}
}
