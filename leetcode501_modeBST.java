import java.util.*;

public class leetcode501_modeBST {

    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    int maxValue = Integer.MIN_VALUE;

    public void preOrderTraversal(TreeNode node){

        if(node == null)
            return;

        if(map.get(node.val) == null){
            map.put(node.val, 1);
        }
        else{
            map.put(node.val,map.get(node.val) + 1);
        }

        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public int[] findMode(TreeNode root) {
        int[] arr = new int[0];
        if(root == null)
            return arr;

        preOrderTraversal(root);

        //Iterate through the hashmap to find max value
        Iterator iterator1 = map.entrySet().iterator();

        while(iterator1.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator1.next();
            int val = (int)mapElement.getValue();
            if(val > maxValue)
                maxValue = val;
        }

        //Iterating through the HashMap to get all the elements with maxVal
        Iterator iterator2 = map.entrySet().iterator();
        while(iterator2.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator2.next();
            int val = (int)mapElement.getValue();
            if(val == maxValue)
                list.add((int)mapElement.getKey());
        }

        //Shifting elements from the arraylist to int array
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        leetcode501_modeBST obj = new leetcode501_modeBST();
        int[] res = obj.findMode(root);
        for(int i: res){
            System.out.println(i);
        }
    }
}
