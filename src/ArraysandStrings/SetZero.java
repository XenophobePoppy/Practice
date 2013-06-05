package ArraysandStrings;

public class SetZero {
	public static void setzero(int[][] matrix){
		boolean[] row= new boolean[matrix.length];
		boolean[] column=new boolean[matrix[0].length];
		
		//tag every position which has 0
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		//set them to 0
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]||column[j]){
					matrix[i][j]=0;
				}
			}
		}
		
	}
	
	public static void print(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		int[][] matrix={
				{1,2,3,4,5},
				{6,7,8,9,0},
				{1,0,1,1,1},
				
						};
		setzero(matrix);
		print(matrix);
	}
}
