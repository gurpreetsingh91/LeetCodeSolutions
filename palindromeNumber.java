package LeetCode;

public class palindromeNumber {

	public static boolean isPalindrome(int input) {

		if(input <0)
			return false;
		long reversedNum = 0;

		long input_long = input;

		while (input_long != 0) {
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}

		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
			// throw new IllegalArgumentException();
			return false;
		}

		System.out.println(reversedNum);
		// return (int)reversedNum;
		
		if (input == (int) reversedNum) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		boolean res = isPalindrome(474474);
		System.out.println(res);
	}
}
