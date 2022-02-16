public class leetcode1328_BreakingAPalindrome {

    public String breakPalindrome(String palindrome) {

        int index = 0;
        String str;
        char[] chars = palindrome.toCharArray();

        //Sample cases
        //aa -> ab
        //bb -> bc
        //aaa -> aab

        //case when there is only single character
        if(palindrome.length() ==1)
            return "";


        //change the first character to 'a' when any other letter is found
        for(Character ch : palindrome.toCharArray()){

            //make the change in the first possbile character

            if(palindrome.length()%2!=0  && index==palindrome.length()/2)
                continue;

            if(ch != 'a' ){
                chars[index] = 'a';
                return String.valueOf(chars);

            }
            index++;
        }

        //change the last character to b
        chars[palindrome.length()-1] = (char)(palindrome.charAt(palindrome.length()-1)+1);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        leetcode1328_BreakingAPalindrome obj = new leetcode1328_BreakingAPalindrome();
        String res = obj.breakPalindrome("a");
        System.out.println(res);
    }
}
