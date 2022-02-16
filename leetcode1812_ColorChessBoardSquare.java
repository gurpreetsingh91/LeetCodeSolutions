public class leetcode1812_ColorChessBoardSquare {

    public static boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0)-'a'+1;
        int num = coordinates.charAt(1)-48;
        String color = "";

        if(letter%2 == 0) {
            color = "white";
        }
        else {
            color = "black";
        }

        if(color.equals("white") && num %2==0) {
            color = "black";
        }
        else if(color.equals("white") && num %2!=0) {
            color = "white";
        }
        else if(color.equals("black") && num %2==0) {
            color = "white";
        }
        else if(color.equals("black") && num %2!=0) {
            color = "black";
        }

        if(color.equals("white"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String coordinates = "c7";
        boolean res = squareIsWhite(coordinates);
        System.out.println(res);
    }
}
