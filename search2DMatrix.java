package LeetCode;

public class search2DMatrix {

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
		int[][] arr = {{1},{2}};
		boolean res = searchMatrix(arr,1);
		System.out.println(res);
	}
}
