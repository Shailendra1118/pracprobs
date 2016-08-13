package com.prac.ds;

import java.util.Arrays;

public class SerializeTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,null,null);
		TreeNode a2 = new TreeNode(2,null,null);
		TreeNode a3 = new TreeNode(3,null,null);
		TreeNode a4 = new TreeNode(4,null,null);
		TreeNode a5 = new TreeNode(5,null,null);
		TreeNode a6 = new TreeNode(6,null,null);
		//TreeNode a7 = new TreeNode(7,null,null);
		root.left = a2;
		root.right = a3;
		root.left.left = a4;
		root.left.right = a5;
		root.right.left = a6;
		
		serializeIt(root);
		System.out.println("Post serial "+Arrays.toString(arr));
		TreeNode node = deserialize();
		System.out.println(node.data);
	}

	static int dctr = 0;
	private static TreeNode dserializeIt(TreeNode node) {
		if(arr[dctr] == -1){
			return null;
		}
		node.left = dserializeIt(new TreeNode(arr[dctr++],null,null));
		node.right = dserializeIt(new TreeNode(arr[dctr++],null,null));
		return node;
	}
	
	private static TreeNode deserialize() {
		if(dctr >= arr.length || arr[dctr] == -1){
			dctr++;
			return null;
		}
		TreeNode node = new TreeNode(arr[dctr], null, null);
		dctr++;
		node.left = deserialize();
		node.right = deserialize();
		return node;
	}

	static int arr[] = new int[15];
	static int ctr = 0;
	private static void serializeIt(TreeNode node) {
		if(node == null){
			arr[ctr++] = -1;
			return;
		}
		arr[ctr++] = node.data;
		serializeIt(node.left);
		serializeIt(node.right);
		
	}

}

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data, TreeNode left, TreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
