package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class validateBinarySearchTree {

	public static List<Integer> list = new ArrayList<Integer>();

	public static void isValidBSTUtil(TreeNode1 root) {

		if (root == null)
			return;

		if (root.left != null)
			isValidBSTUtil(root.left);
		
		list.add(root.val);
		
		
		if (root.right != null)
			isValidBSTUtil(root.right);
		
	}

	public static boolean isValidBST(TreeNode1 root) {

		if(root == null)
			return true;
		
		isValidBSTUtil(root);
		
		
		Iterator it = list.iterator();
		
		int temp = (Integer)it.next(),temp1;
		while(it.hasNext()){
			temp1 = (Integer)it.next(); 
			if(( temp1 <= temp))
				return false;
			else
				temp = temp1; 
		}
		
		return true;
	}

	public static void main(String[] args) {
		TreeNode1 one = new TreeNode1(5);
		TreeNode1 two = new TreeNode1(14);
		TreeNode1 three = new TreeNode1(1);
		//two.left = one;
		//two.right = three;
		one.left = two;
		two.left = three;
		boolean res = isValidBST(one);
		System.out.println(res);

	}
}
