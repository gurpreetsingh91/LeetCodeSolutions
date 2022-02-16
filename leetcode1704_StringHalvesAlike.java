public class leetcode1704_StringHalvesAlike {


    public boolean halvesAreAlike(String s) {

        int len = s.length(), count1=0, count2=0;


        for(int i=0;i<len/2;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count1++;
            }
        }

        for(int i=len/2;i<len;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count2++;
            }
        }

        if(count1 == count2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        leetcode1704_StringHalvesAlike obj = new leetcode1704_StringHalvesAlike();
        boolean res = obj.halvesAreAlike("AbCdEfGh");
        System.out.println(res);


    }
}
