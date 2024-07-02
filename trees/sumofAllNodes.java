package trees;

public class sumofAllNodes {
    public static int sumOfAllNode(TreeNode<Integer> root){
		if(root == null){
			return 0 ;

		}
		int sum = root.data;
		for(int i=0; i<root.children.size();i++){
			sum = sum +sumOfAllNode(root.children.get(i));//calling recrsionvalue of all children 
			

		}
		return sum ;
		
	
	}
    
}
