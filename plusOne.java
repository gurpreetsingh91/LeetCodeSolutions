package LeetCode;

public class plusOne {

	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		int tempNum;
		if (len == 1) {
			tempNum = digits[0] + 1;
			if (tempNum > 9) {
				int[] newArr = new int[2];
				newArr[0] = 1;
				newArr[1] = 0;
				return newArr;
			} else {
				digits[0] = digits[0] + 1;
				return digits;
			}

		}
		int add = 1, sum;
		for (int j = len - 1; j >= 0; j--) {

			sum = add + digits[j];
			if (sum > 9) {

				digits[j] = 0;
				add = 1;
			} else {
				digits[j] = digits[j] + add;
				add = 0;
			}
		}
		
		if(add == 1){
			int[] newArr = new int[len+1];
			newArr[0] = 1;
			for(int j=0;j<len;j++){
				newArr[j+1] = digits[j];
			}
			return newArr;
		}

		return digits;
	}

	public static void main(String[] args) {
		int[] num = { 9,9 };
		int[] res = plusOne(num);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i] + " ");
		}

	}
}
