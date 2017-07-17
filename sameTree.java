package LeetCode;

public class sameTree {

	public static boolean isSameTree(TreeNode1 p, TreeNode1 q) {

		
		if(p == null && q == null)
			return true;
		
		if((p == null && q!=null) || (p != null && q==null)){
			return false;
		}
		
		if(p.val != q.val){
			return false;
		}
		
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		
	}
	
	
	public static void main(String[] args) {

		// Tree 1
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 two = new TreeNode1(2);
		TreeNode1 three = new TreeNode1(3);
		TreeNode1 fourth = new TreeNode1(4);
		TreeNode1 fifth = new TreeNode1(5);
		two.left = three;
		two.right = fourth;
		root.left = fifth;
		root.right = two;

		// Tree 2
		TreeNode1 root2 = new TreeNode1(1);
		TreeNode1 two2 = new TreeNode1(2);
		TreeNode1 three2 = new TreeNode1(3);
		TreeNode1 fourth2 = new TreeNode1(4);
		TreeNode1 fifth2 = new TreeNode1(5);
		two.left = three2;
		two.right = fourth2;
		root.left = fifth2;
		root.right = two2;
		
		boolean res = isSameTree(null,null);
		System.out.println(res);

	}
}
