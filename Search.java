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

import java.util.ArrayList;

public class Search {
	
	public static void main(String[] args) {
		StdDraw.setCanvasSize();
		StdDraw.setXscale(0,512);
		StdDraw.setYscale(0,512);
		
		Tree tree = new Tree();
		int cat = tree.generateTree();
		System.out.println("The cat is at node " + cat);
		tree.findCat(cat, tree.getRoot());
		ArrayList<NodePointer> path = tree.getPathToCat();
		System.out.println("The path: " + path);
		
		
	}
	
}