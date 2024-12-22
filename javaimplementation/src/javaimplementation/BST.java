package javaimplementation;
import java.util.*;
public class BST {

    public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}

	}
    
    //program to build a BST 

    public static Node buildBST(Node root , int val){
        if(root ==null){
            root = new Node(val);
            return root;
        }

        if(root.data<val){
           root.right= buildBST(root.right, val);
        }
        else if(root.data>val){
           root.left= buildBST(root.left, val);
        }
        return root ;
    } 


    //Inorder traversal for a BST is sorted 

    public static void inodr(Node root) {
		if (root == null) {
			return;
		}
		inodr(root.left);
		System.out.print(root.data);
		inodr(root.right);
	}

    //Search in a BST
    public static boolean searchBST(Node root , int itm){
        if(root ==null){
            return false;
        }
        if(root.data==itm){
            return true;
        }
      if(itm>root.data){
          return  searchBST(root.right, itm);
        }
        else{return searchBST(root.left, itm);}
       
    }

    
    public static void main(String[] args) {
        int val[]={5,1,3,4,2,7};
        Node root = null;
        for(int x: val){
            root = buildBST(root, x);
        }
        inodr(root);
        System.out.println();

       System.out.println( searchBST(root, 10));
    }
    
}
