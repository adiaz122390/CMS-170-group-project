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

import java.util.Random;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Tree {
	
	//----------------------/Data Members/-------------------------//
	
	private NodePointer root;
	
	private static ArrayList<NodePointer> pathToCat = new ArrayList<>();
	
	//----------------------/Constructors/-------------------------//
	
	public Tree() {
		root = null;
	}
	
	public Tree(NodePointer root) {
		root = new NodePointer();
		this.root = root;
	}
	
	//------------------/Getter's and Setter's/---------------------//
	
	public NodePointer getRoot() {
		return root;
	}
	
	public void setRoot(NodePointer root) {
		this.root = root;
	}
	
	public ArrayList<NodePointer> getPathToCat() {
		return pathToCat;
	}
	
	//-------------------------/Methods/----------------------------//
	
	// Method that generates a binary tree with a root and 10 additional nodes
	// The root will have data value of 0
	// Each node data will be the count of the order in which it was added (1-10), which is in Breadth-First traversal order
	// In other words, nodes will be added from left to right on each level before moving onto the next level
	// A random number is generated from 1 to 10, determining the data value of the node where the cat will be 
	// it returns the integer value of where the cat is after the tree is created
	
	public int generateTree() {
		Random random = new Random();
		int cat = random.nextInt(9) + 1;
		drawCat(460,400, cat);
		
		int count = 1;
		if (root == null) {
			setRoot(new NodePointer(0, 256, 10));
			drawCircle(256,10,0);
			StdDraw.text(236,10,"0",0);
		}
		else {
			if(root.getData() != 0) {
				root.setData(0);
			}
		}
		while(count <= 10) {
			if (root.getLeftChild() == null) {
				root.setLeftChild(new NodePointer(count, 128,80));
				if (cat == count) {
					drawCircle(128,80,1);
					StdDraw.line(256, 10, 128, 80);
					StdDraw.text(108,80,"1",0);
				} else {
					drawCircle(128,80,0);
					StdDraw.line(256, 10, 128, 80);
					StdDraw.text(108,80,"1",0);
				}
			}	
			else if (root.getRightChild() == null) {
				root.setRightChild(new NodePointer(count, 384,80));
				if (cat == count) {
					drawCircle(384,80,1);
					StdDraw.line(256, 10, 384, 80);
					StdDraw.text(364,80,"2",0);
				} else {
					drawCircle(384,80,0);
					StdDraw.line(256, 10, 384, 80);
					StdDraw.text(364,80,"2",0);
				}
			}
			else if (root.getLeftChild().getLeftChild() == null) {
				root.getLeftChild().setLeftChild(new NodePointer(count, 64,150));
				if (cat == count) {
					drawCircle(64,150,1);
					StdDraw.line(128, 80, 64, 150);
					StdDraw.text(44,150,"3",0);
				} else {
					drawCircle(64,150,0);
					StdDraw.line(128, 80, 64, 150);
					StdDraw.text(44,150,"3",0);
				}
			}
			else if (root.getLeftChild().getRightChild() == null) {
				root.getLeftChild().setRightChild(new NodePointer(count, 192,150));
				if (cat == count) {
					drawCircle(192,150,1);
					StdDraw.line(128, 80, 192, 150);
					StdDraw.text(172,150,"4",0);
				} else {	
					drawCircle(192,150,0);
					StdDraw.line(128, 80, 192, 150);
					StdDraw.text(172,150,"4",0);
				}
			}
			else if (root.getRightChild().getLeftChild() == null) {
				root.getRightChild().setLeftChild(new NodePointer(count, 320,150));
				if (cat == count) {
					drawCircle(320,150,1);
					StdDraw.line(384, 80, 320, 150);
					StdDraw.text(300,150,"5",0);
				} else {
					drawCircle(320,150,0);
					StdDraw.line(384, 80, 320, 150);
					StdDraw.text(300,150,"5",0);
				}
			}
			else if (root.getRightChild().getRightChild() == null) {
				root.getRightChild().setRightChild(new NodePointer(count, 448,150));	
				if (cat == count) {
					drawCircle(448,150,1);
					StdDraw.line(384, 80, 448, 150);
					StdDraw.text(428,150,"6",0);
				} else {
					drawCircle(448,150,0);
					StdDraw.line(384, 80, 448, 150);
					StdDraw.text(428,150,"6",0);
				}
			}
			else if (root.getLeftChild().getLeftChild().getLeftChild() == null) {
				root.getLeftChild().getLeftChild().setLeftChild(new NodePointer(count, 32,220));
				if (cat == count) {
					drawCircle(32,220,1);
					StdDraw.line(64, 150, 32, 220);
					StdDraw.text(12,220,"7",0);
				} else {
					drawCircle(32,220,0);
					StdDraw.line(64, 150, 32, 220);
					StdDraw.text(12,220,"7",0);
				}
			}
			else if (root.getLeftChild().getLeftChild().getRightChild() == null) {
				root.getLeftChild().getLeftChild().setRightChild(new NodePointer(count, 96,220));
				if (cat == count) {
					drawCircle(96,220,1);
					StdDraw.line(64, 150, 96, 220);
					StdDraw.text(76,220,"8",0);
				} else {
					drawCircle(96,220,0);
					StdDraw.line(64, 150, 96, 220);
					StdDraw.text(76,220,"8",0);
				}
			}
			else if (root.getLeftChild().getRightChild().getLeftChild() == null) {
				root.getLeftChild().getRightChild().setLeftChild(new NodePointer(count, 160,220));
				if (cat == count) {
					drawCircle(160,220,1);
					StdDraw.line(192, 150, 160, 220);
					StdDraw.text(140,220,"9",0);
				} else {
					drawCircle(160,220,0);
					StdDraw.line(192, 150, 160, 220);
					StdDraw.text(140,220,"9",0);
				}
			}
			else if (root.getLeftChild().getRightChild().getRightChild() == null) {
				root.getLeftChild().getRightChild().setRightChild(new NodePointer(count, 224,220));
				if (cat == count) {
					drawCircle(224,220,1);
					StdDraw.line(192, 150, 224, 220);
					StdDraw.text(202,220,"10",0);
				} else {
					drawCircle(224,220,0);
					StdDraw.line(192, 150, 224, 220);
					StdDraw.text(202,220,"10",0);
				}
			}
			count++;
		}
		return cat;
	}
	
	//recursive method to determine whether or not the cat is in the tree (or subtree)
	//compares the data of each node to the cat value
	//returns a boolean
	
	public boolean existsInTree(int cat, NodePointer root) {
		if (root == null) {
			return false;
		}
		if (root.getData() == cat) {
			return true;
		}
		boolean exists = existsInTree(cat, root.getLeftChild()) || existsInTree(cat, root.getRightChild());

		return exists;
	}
	//recursive method to find the path from the root to the node with the cat
	//calls existsInTree method to determine if the tree (or subtree) with the current node as root has the cat in it
	//if it does, it adds the node to the arraylist holding the path of nodes
	//then it checks if the cat exists in the subtrees of each of its left and right children
	//if it does exist, then the findCat method recursively calls itself and continues checking the nodes in the correct subtrees
	//each time the method moves on the path toward the cat node, the node is added to the arraylist
	
	public void findCat(int cat, NodePointer root) {
	
		if (root == null) {
			return;
		}
		if (existsInTree(cat, root)) {
			pathToCat.add(root);
			boolean waiting = true;
			while(waiting) {
				if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
					waiting = false;
				}
				StdDraw.show(150);
			}
			drawCircle(root.getX(), root.getY(), 2);
			if (existsInTree(cat, root.getLeftChild())) {
				findCat(cat, root.getLeftChild());
			}
			else if (existsInTree(cat, root.getRightChild())) {
				findCat(cat, root.getRightChild());
			}
		}
	}
	
	// Draws a filled circle based on x and y input
	public void drawCircle(double x, double y, int color) {
		if (color == 2) {
			StdDraw.setPenColor(0,0,0);
			StdDraw.filledCircle(x, y, 10);
		} else if (color == 1 ){
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.filledCircle(x, y, 10);
		} else {
			StdDraw.setPenColor(0, 0, 255);
			StdDraw.filledCircle(x, y, 10);
		}
	}
	
	
	// Draw a picture of Mittens from a file and displays the node where she is stuck at.
	public void drawCat(double x, double y, int cat) {
		StdDraw.picture(x,y, "Mittens.png", 150,150);
		StdDraw.setPenColor(0,0,255);
		StdDraw.text(300,450,"Help! I'm at Node " + cat + "!");
	}
}