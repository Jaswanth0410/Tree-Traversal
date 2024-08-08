class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTree
{
    Node root;

    public void insert(int data)
    {   
        Node n = new Node(data);
        if(root==null)
        {
            root=n;
            return;
        }

        Node temp=root;

        while(true)
        {
            if(n.data==temp.data)
            return;
            if(n.data<temp.data)
            {
                if(temp.left==null)
                {
                    temp.left=n;
                    return;
                }
                temp = temp.left;
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=n;
                    return;
                }
                temp = temp.right;
            }
        }
    }
        public boolean search(int data)
        {
            if(root==null)
            return false;

            Node temp = root;
            while(temp!=null)
            {
                if(data<temp.data)
                temp = temp.left;
                else if(data>temp.data)
                temp=temp.right;
                else
                return true;
            }
        return false;

        }    
}


public class BST {
    public static void main(String args[])
    {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(5);
        bt.insert(2);
        bt.insert(3);
        bt.insert(10);
        bt.insert(13);
        // System.out.println(bt.root.right.right.data);
       System.out.println(bt.search(12)); 

    }   
}


