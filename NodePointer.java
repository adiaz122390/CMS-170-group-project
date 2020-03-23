// Name: Alexander, Miriam, Ming Rui
// Assignment: Group project
// Course: CMS 170 Problem Solving II with Java
// Due Date: 12/02/2019
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
// This project focuses on creating and manipulating a tree.
// The tree is drawn out with a node containing a cat.
// A breadth first alorithm is used to find a path to a cat stuck in a tree.
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
public class NodePointer {

	private int data;
	private NodePointer leftChild;
	private NodePointer rightChild;
	private double x;
	private double y;
	
	public NodePointer() {
		leftChild = null;
		rightChild = null;
	}
	
	public NodePointer (int data, double x, double y) {
		leftChild = null;
		rightChild = null;
		this.data = data;
		this.x = x;
		this.y = y;
	}
	
	public int getData() {
		return data;
	}
	
	public NodePointer getLeftChild() {
		return leftChild;
	}
	
	public NodePointer getRightChild() {
		return rightChild;
	}
	
	public Double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLeftChild(NodePointer leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(NodePointer rightChild) {
		this.rightChild = rightChild;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return Integer.toString(data);
	}
	
}