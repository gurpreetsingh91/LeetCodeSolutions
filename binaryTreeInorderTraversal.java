package LeetCode;

import java.util.ArrayList;
import java.util.List;


 class TreeNode1 {
	Integer val;
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1(Integer x) {
		val = x;
	}
}

public class binaryTreeInorderTraversal {
    static List<Integer> res =new ArrayList<Integer>();

	public static List<Integer> inorderTraversal(TreeNode1 root) {
		
		if(root == null)
			return res;
		
		if(root.left != null)
			inorderTraversal(root.left);
		
		res.add(root.val);
		
		if(root.right != null)
			inorderTraversal(root.right);
		
		return res;
	}

	public static void main(String[] args) {
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 two = new TreeNode1(2);
		TreeNode1 three = new TreeNode1(3);
		two.left = three;
		root.right = two;
		List<Integer> res = inorderTraversal(null);
		System.out.println(res.toString());
	}
}
