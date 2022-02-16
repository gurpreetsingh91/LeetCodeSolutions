package assessment.microsoft;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class question2 {

    List<TreeNode> list = new ArrayList<>();

    public void inOrderTraversal(TreeNode root) {

        if (root == null)
            return;

        if (root.left != null)
            inOrderTraversal(root.left);
        list.add(root);

        if (root.right != null)
            inOrderTraversal(root.right);
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (root.left != null )
            inOrderTraversal(root.left);
        list.add(root);

        if (root.right != null )
            inOrderTraversal(root.right);

        //traversing the list

        for (int i=0; i< list.size(); i++) {
            if (list.get(i).val == p.val && i < list.size()-1)
                return list.get(i+1);
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        TreeNode tree2 = new TreeNode(2);

        question2 obj = new question2();

        TreeNode treeNode = obj.inorderSuccessor(root, tree2);
        System.out.println(treeNode.val);
    }
}
