package LeetCode;

public class search2DMatrix2 {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix.length == 0){
			return false;
		}
		int colLen = matrix[0].length , rowLen = matrix.length;
		int x = 0 , y = colLen-1;
		
		while(x <= rowLen-1 && y >=0 ){
			
			if(matrix[x][y] == target){
				return true;
			}
			else if(target < matrix[x][y] ){
				y = y -1;
			}
			else if(target > matrix[x][y]){
				x = x +1;
			}
		}
		return false;
    }

	public static void main(String[] args) {
		
		int[][] arr = {{1,   4,  7, 11, 15},
					   {2,   5,  8, 12, 19},
				       {3,   6,  9, 16, 22},
				       {10, 13, 14, 17, 24},
				       {18, 21, 23, 26, 30}
				      };
		boolean res = searchMatrix(arr,19);
		System.out.println(res);
		
		
	}
}
