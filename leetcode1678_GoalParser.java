public class leetcode1678_GoalParser {

    public String interpret(String command) {
        String temp = command;
        StringBuilder sb = new StringBuilder();

        while(temp.length()!= 0){
            if(temp.startsWith("G")) {
                sb.append("G");
                temp = temp.replaceFirst("G","");
            }
            else if(temp.startsWith("()")) {
                sb.append("o");
                temp = temp.replaceFirst("(\\(\\))","");

            }
            else if(temp.startsWith("(al)")) {
                sb.append("al");
                temp = temp.replaceFirst("(\\()","");
                temp = temp.replaceFirst("al","");
                temp = temp.replaceFirst("(\\))","");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "(al)G(al)()()G";
        leetcode1678_GoalParser obj = new leetcode1678_GoalParser();
        String res = obj.interpret(str);
        System.out.println(res);
    }
}
