package project;

public class BSTTest {
	
	
	//Creating main class with reference to test binary search tree
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		// Adding ----- to separate outputs
		tree.insert(24);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(12);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(36);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(5);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(7);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(2);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(76);
		System.out.println(tree);
		System.out.println("---------------");
		tree.remove(24);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(18);
		System.out.println(tree);
		System.out.println("---------------");
		tree.insert(24);
		System.out.println(tree);
		System.out.println("---------------");
	}

}


