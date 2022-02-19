package com.example.interviewpreparation.maxdepthofbinarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root.val == subRoot.val) return isSameTree(root, subRoot);
        if (root.left.val == subRoot.val) return isSubtree(root.left, subRoot);
        if (root.right.val == subRoot.val) return isSubtree(root.right, subRoot);
        return false;
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                integers.add(remove.val);
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
            }
            result.add(integers);
        }
        System.out.println(result);
        return result;
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.right == null) {
            if (root.val <= root.left.val) {
                return false;
            } else {
                return isValidBST(root.left);
            }
        } else if (root.left == null) {
            if (root.val >= root.right.val) {
                return false;
            } else {
                return isValidBST(root.right);
            }

        } else {
            return isValidBST(root.left) && isValidBST(root.right);
        }

    }

    public static void main(String[] args) {
      /*  TreeNode myTree = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, new TreeNode(5, null, null), null)));

        System.out.println(maxDepth(myTree));*/

        /*TreeNode myTree1 = new TreeNode(1, new TreeNode(2, new TreeNode(7, null, null), null), new TreeNode(3, null, null));
        TreeNode myTree2 = new TreeNode(1, new TreeNode(2, new TreeNode(7, null, null), null), new TreeNode(3, null, null));
        System.out.println(isSameTree(myTree1, myTree2));*/

       /* TreeNode myTree = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));

        System.out.println(myTree);
        System.out.println("--- After Inversion ---");
        System.out.println(invertTree(myTree));*/

     /*   TreeNode myTree = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)), new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));

        levelOrder(myTree);*/

        /*TreeNode myTree1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode myTree2 = new TreeNode(4, null, null);
        System.out.println(isSubtree(myTree1, myTree2));*/

        TreeNode myTree1 = new TreeNode(2, new TreeNode(1, null, null), null);
        System.out.println(isValidBST(myTree1));
    }
}
