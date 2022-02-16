public class leetcode1323_maximum69Number {

    public int maximum69Number (int num) {

        String str = Integer.toString(num);

        str = str.replaceFirst("6", "9");

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        leetcode1323_maximum69Number obj = new leetcode1323_maximum69Number();
        int res = obj.maximum69Number(9999);
        System.out.println(res);
    }
}
