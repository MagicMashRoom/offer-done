package org.offer.case39;

import org.junit.Test;
import org.offer.utils.BinaryTree;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.print.PrintBinaryTree;

import static org.junit.Assert.*;

/**
 * 面试题 39: 二叉树的深度
 * Created by tanc on 17-6-14.
 */
public class TreeDepthTest {

    @Test
    public void case1() throws Exception {
        // 平衡二叉树
        BinaryTree<Integer> tree = new BinaryTree<>(47);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        // 中序遍历结果为：[5,2,4,1,6,3]
        // 前序遍历结果为：[1,2,5,4,3,6]
        int depth = TreeDepth.methodOne(tree.getRoot());
        assertEquals(3, depth);
    }

    @Test
    public void case2() throws Exception {
        // 非平衡二叉树
        BinaryTree<Integer> tree = new BinaryTree<>(3);
        tree.addRandom(1);
        tree.addRandom(2);
        tree.addRandom(3);
        tree.addRandom(4);
        tree.addRandom(5);
        tree.addRandom(6);
        tree.addRandom(7);
        tree.addRandom(8);
        tree.addRandom(9);
        // 中序遍历结果为：[1,6,7,3,9,2,8,4,5]
        // 前序遍历结果为：[1,2,3,6,7,9,4,8,5]
        PrintBinaryTree.inOrder(tree.getRoot());
        PrintBinaryTree.preOrder(tree.getRoot());
        int depth = TreeDepth.methodOne(tree.getRoot());
        assertEquals(5, depth);
    }

    @Test
    public void case3() throws Exception {
        // 二叉树所有节点都没有左子树
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> right1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right2 = new BinaryTreeNode<>(3);
        root.right = right1;
        right1.right = right2;

        int depth = TreeDepth.methodOne(root);
        assertEquals(3, depth);
    }

    @Test
    public void case4() throws Exception {
        // 二叉树所有节点都没有右子树
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> left1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> left2 = new BinaryTreeNode<>(3);
        root.left = left1;
        left1.right = left2;

        int depth = TreeDepth.methodOne(root);
        assertEquals(3, depth);
    }

    @Test
    public void case5() throws Exception {
        // 只有一个节点
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4);
        int depth = TreeDepth.methodOne(root);
        assertEquals(1, depth);
    }

}