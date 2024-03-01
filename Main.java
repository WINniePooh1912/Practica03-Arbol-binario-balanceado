public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree(4);

		tree.push(3);
		tree.push(89);
		tree.push(5);
		tree.push(1);
		tree.push(8);
		// tree.add(7);
		// tree.add(12);
		// tree.add(51);
		// tree.add(2);
		// tree.add(9);

		System.out.println("Preorder:");
		tree.preorderLeft(tree);
		System.out.println();
		tree.preorderRight(tree);

		System.out.println("\nPostorder:");
		tree.postorderLeft(tree);
		System.out.println();
		tree.postorderRight(tree);

		System.out.println("\nInorder:");
		tree.inorderLeft(tree);
		System.out.println();
		tree.inorderRight(tree);
	}
}
