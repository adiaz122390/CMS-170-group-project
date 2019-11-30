import java.lang.Math;

public class Tree {

	private Branch root;
	
	
	public Tree() {
		root = null;
	}
	
	public void setRoot(Branch branch) {
		root = branch;
	}
	
	public Branch getRoot() {
		return root;
	}
	
	public void addBranch(Branch branch) {
		
		if (root == null) {
			root = branch;
			return;
		}
		Branch temp = root;
		boolean searching = true;
		while(searching) {
			double n = Math.random();
			if (n < .5 && temp.hasLeftChild()) {
				temp = temp.getLeftChild();
			} else if (n >= .5 && temp.hasRightChild()) {
				temp = temp.getRightChild();
			} else if (n < .5) {
				temp.setLeftChild(branch);
				searching = false;
			} else {
				temp.setRightChild(branch);
				searching = false;
			}
		}
		
		
	}
	
	
}
