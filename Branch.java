import java.lang.Math;

public class Branch {

	private int data;
	private Branch leftChild;
	private Branch rightChild;
	
	
	
	public Branch() {
		leftChild = null;
		rightChild = null;
	}
	
	
	public Branch(int n) {
		leftChild = null;
		rightChild = null;
		data = n;
	}
	
	public void setLeftChild(Branch branch) {
		leftChild = branch;
	}
	
	public void setRightChild(Branch branch) {
		rightChild = branch;
	}
	
	public void setData(int n) {
		data = n;
	}
	
	public Branch getLeftChild() {
		return leftChild;
	}
	
	public Branch getRightChild() {
		return rightChild;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean checkRandSide() {
		double n = Math.random();
		if (n < .5 ) {
			if (leftChild != null) {
				return true;
			} else {
				return false;
			}
		} else {
			if (rightChild != null) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean hasLeftChild() {
		return leftChild != null;
	}
	
	public boolean hasRightChild() {
		return rightChild != null;
	}
	
}
