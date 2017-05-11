/**
 * 
 */
package com.whu.test;

/**
 * @author hongliang
 *
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ykanghe on 2016/9/7.
 */
public class BinTree {

	private static class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static TreeNode createTree(TreeNode root, List<Integer> list) {
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty() && count < list.size()) {
			TreeNode lastNode = queue.poll();

			if (count < list.size()) {
				TreeNode left = new TreeNode(list.get(count++));
				lastNode.left = left;
				queue.add(left);
			}
			if (count < list.size()) {

				TreeNode right = new TreeNode(list.get(count++));
				lastNode.right = right;
				queue.add(right);
			}
		}
		return root;
	}

	/**
	 * 先序遍历
	 * 
	 * @param node
	 */
	public static long preOrderTraver(TreeNode node) {
		if (node == null) {
			return 0;
		}
		long num= node.data;
		num += preOrderTraver(node.left);
		num += preOrderTraver(node.right);
		return num;
	}

	public static long midOrderTraver(TreeNode node) {
		if (node == null) {
			return 0;
		}
		long num = preOrderTraver(node.left);
		num += preOrderTraver(node.right);
		num += node.data;
		return num;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		;
		for (int i = 0; i < 6000; i++) {
			list.add(i);
		}
		TreeNode root = new TreeNode(0);

		root = createTree(root, list);

		long start = System.currentTimeMillis();
		System.out.println(preOrderTraver(root));
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		start = System.currentTimeMillis();
		System.out.println(midOrderTraver(root));
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}