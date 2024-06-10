
package javaimplementation;

import java.util.*;

public class binarytree {

	public static class node {
		int data;
		node left;
		node right;

		public node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}

	}

	static  class btree {
		static int idx = -1;

		public node btreebuilder(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			node newnode = new node(nodes[idx]);
			newnode.left = btreebuilder(nodes);
			newnode.right = btreebuilder(nodes);
			return newnode;
		}
	}

	public static void preodr(node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data);
		preodr(root.left);
		preodr(root.right);
	}

	public static void inodr(node root) {
		if (root == null) {
			return;
		}
		inodr(root.left);
		System.out.print(root.data);
		inodr(root.right);
	}

	public static void postodr(node root) {
		if (root == null) {
			return;
		}
		postodr(root.left);
		postodr(root.right);
		System.out.print(root.data);

	}

	public static void lvlodr(node root) {
		if (root == null) {
			return;
		}
		Queue<node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			node currnode = q.remove();
			if (currnode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(currnode.data + " ");
				if (currnode.left != null) {
					q.add(currnode.left);
				}
				if (currnode.right != null) {
					q.add(currnode.right);
				}
			}
		}
	}

	public static int bthgt(node root) {
		if (root == null) {
			return 0;
		}
		int lh = bthgt(root.left);
		int rh = bthgt(root.right);
		int hgt = Math.max(lh, rh) + 1;
		return hgt;
	}

	public static int tnodes(node root) {
		if (root == null) {
			return 0;
		}
		int lh = bthgt(root.left);
		int rh = bthgt(root.right);
		int tnodes = lh + rh + 2;
		return tnodes;
	}

	public class info {
		int dia;
		int ht;

		public info(int dia, int ht) {
			this.dia = dia;
			this.ht = ht;
		}
	}

	public static boolean is_identical(node root, node subroot) {
		// node.data!=subroot.data
		if(root==null && subroot==null) {
			return true;
		}
		else if (root == null || subroot == null || root.data != subroot.data) {
			return false;
		}
		
		
		if (!is_identical(root.left, subroot.left)) {
			return false;
		}
		
		if(!is_identical(root.right,subroot.right)) {
			return false;
		}
		return true;
	}
	public static boolean is_subtree(node root,node subroot) {
		if (root == null) {
			return false;
		}
		if(root.data==subroot.data) {
			is_identical(root,subroot);
				return true;
			}
		return is_subtree(root.left,subroot)|| is_subtree(root.right,subroot);
		}


//	public static info diameter(node root) {
//		if (root == null) {
//			
//			return new  info(0,0);
//		}
//		info linfo=diameter(root.left);
//		info rinfo = diameter(root.right);
//		int diam = Math.max(Math.max(linfo.dia, rinfo.dia),linfo.ht+rinfo.ht+1);
//		int hgt=Math.max(linfo.ht, rinfo.ht)+1;
//		return new info(diam,hgt);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		btree tree = new btree();
		node root = tree.btreebuilder(nodes);
		int nodes2[]= {2,4,-1,-1,5,-1,-1};
		
		node subroot = tree.btreebuilder(nodes2);
		// System.out.println(root.data);
		preodr(root);
//		System.out.println();
//
//		inodr(root);
//		System.out.println();
//
//		postodr(root);
		 lvlodr(root);
		// System.out.println( tnodes(root));
		// System.out.println(diameter(root));
		///System.out.println(is_subtree(root,subroot));
	}

}
