// Preorder Traversal
import java.util.*;
class TreeNode {
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value = value;
        left=right=null;
    }
}

public class TreeTraversal{
    void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
        return;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        TreeTraversal tree = new TreeTraversal();
        System.out.print("Pre-order Traversal:");
        tree.preorder(root);
    }
}

