package LeetCode;

public class symmetricTree {

	static int flag =0;
	public static void  isSymmetricUtil2(TreeNode root1,TreeNode root2){
		
		 
		if(root1.val != root2.val){
			flag = 1;
			return;
		}
		
		
		//left cases
		if(root1.left != null && root2.left == null){
			flag =1;
			return;
		}
		else if(root1.left == null && root2.left != null){
			flag =1;
			return;
		}
		else if(root1.left != null && root2.left != null){
			isSymmetricUtil2(root1.left,root2.left);
		}	
		
		//right cases
		if(root1.right != null && root2.right == null){
			flag =1;
			return;
		}
		else if(root1.right == null && root2.right != null){
			flag =1;
			return;
		}
		else if(root1.right != null && root2.right != null){
			isSymmetricUtil2(root1.right,root2.right);
		}
			
	}
	
	public static void isSymmetricUtil(TreeNode root){
		
		TreeNode temp ;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left != null)
			isSymmetricUtil(root.left);
		
		if(root.right != null)
			isSymmetricUtil(root.right);
		
	}
	
	
	public static boolean isSymmetric(TreeNode root) {
		
		TreeNode secondTreeRoot = root;
		
		isSymmetricUtil(secondTreeRoot);
		
		//Now do the comparison
		if(root == null && secondTreeRoot != null)
			return true;
		
		if(root != null && secondTreeRoot == null){
			flag =1 ;
			return false;
		}
		
		if(root == null && secondTreeRoot != null){
			flag =1 ;
			return false;
		}
		
		isSymmetricUtil2(root,secondTreeRoot);
		
		if(flag == 1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		TreeNode sixth = new TreeNode(3);
		
		root.left = one;
		root.right = two;
		//root.left.left = three;
		root.left.right = four;
		//root.right.left = fifth;
		root.right.right = sixth;
		
		boolean res = isSymmetric(root);
		System.out.println(res);
	}
}
