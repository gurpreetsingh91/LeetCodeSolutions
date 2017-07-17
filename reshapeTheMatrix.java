package LeetCode;

import java.util.Scanner;

public class reshapeTheMatrix {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {

		int row = nums.length , col = nums[0].length,counter=0;
		int size = row *col;
		int[] res = new int[size];
		int[][] finalMatrix = new int[r][c];
		int max = r*c;
		
		if(max != size)
			return nums;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				res[counter++] = nums[i][j];
			}
		}
		
		counter=0;
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				finalMatrix[i][j] = res[counter++];
				//System.out.print(finalMatrix[i][j] + " ");
			}
			//System.out.println();
		}
		
		//System.out.println(size);
		
		return finalMatrix;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = {{1,2},{3,4}};
		int[][] res = matrixReshape(arr,1,4);
		
	}
}
