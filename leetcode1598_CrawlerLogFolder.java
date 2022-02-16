public class leetcode1598_CrawlerLogFolder {

    public int minOperations(String[] logs) {
        int distance = 0;
        for(String str: logs){
            if(str.endsWith("../") && distance>0)
                distance--;
            else if(str.endsWith("./")){
                //do nothing
            }
            else
                distance++;
        }
        if(distance<0)
            return 0;
        else
            return distance;
    }

    public static void main(String[] args) {
        leetcode1598_CrawlerLogFolder obj = new leetcode1598_CrawlerLogFolder();
        String[] logs = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
        int result = obj.minOperations(logs);
        System.out.println(result);
    }
}
