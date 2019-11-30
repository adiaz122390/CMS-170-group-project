
public class Driver {

	
	
	
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		for (int i = 0; i < 10; i++) {
			Branch branch = new Branch(i);
			tree.addBranch(branch);
		}
		
		
		
	}
	
}
