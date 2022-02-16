public class leetcode1455_prefixWords {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");
        int notFound = -1, index = 1;
        for (String word : words) {
            if (word.startsWith(searchWord))
                return index;
            index++;
        }

        return notFound;
    }

    public static void main(String[] args) {
        String sentence = "hello from the other side", searchWord = "they";
        leetcode1455_prefixWords obj = new leetcode1455_prefixWords();
        int res = obj.isPrefixOfWord(sentence, searchWord);
        System.out.println(res);
    }
}
