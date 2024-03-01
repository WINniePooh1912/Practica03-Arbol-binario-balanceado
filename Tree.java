class Tree {
	int value;
	Tree right;
	Tree left;

	Tree(int value) {
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public void setValue(int value){
		this.value = value;
	}

	public Tree getLeft(){
		return left;
	}

	public void setLeft(Tree left){
		this.left = left;
	}

	public Tree getRight(){
		return right;
	}

	public void setRight(Tree right){
		this.right = right;
	}

	public void push(int value) {
		Tree newBranch = new Tree(value);

		if (value < this.value) {
			if(this.left == null)
				this.left = newBranch;
			else
				this.left.push(value);
		}
	 	else if (value > this.value) {
			if(right == null)
				this.right = newBranch;
			else
				this.right.push(value);
		}
	}

	// public void add(int value) {
	// 	root = push(root, value);
	// }

	// private Tree push(int value) {
	// 	if (current == null)
	// 		return new Tree(value);

	// 	if (value < current.value)
	// 		current.left = push(current.left, value);
	// 	else if (value > current.value)
	// 		current.right = push(current.right, value);

	// 	return current;
	// }

    public void preorderLeft(Tree tree) {
		if (tree != null) {
			System.out.print(tree.value + ",");
			if (left != null)
				preorderLeft(tree.left);
			if (right != null)
				preorderLeft(tree.right);
		}
	}

    public void preorderRight(Tree tree) {
		if (tree != null) {
			System.out.print(tree.value + ",");
			if (right != null)
				preorderRight(tree.right);
			if (left != null)
				preorderRight(tree.left);
		}
	}

	public void postorderLeft(Tree tree) {
		if (tree != null) {
			if (left != null)
				postorderLeft(tree.left);
			if (right != null)
				postorderLeft(tree.right);
			System.out.print(tree.value + ",");
		}
	}

	public void postorderRight(Tree tree) {
		if (tree != null) {
			if (right != null)
				postorderRight(tree.right);
			if (left != null)
				postorderRight(tree.left);
			System.out.print(tree.value + ",");
		}
	}

	public void inorderLeft(Tree tree) {
		if (tree != null) {
			if (left != null)
				inorderLeft(tree.left);
			System.out.print(tree.value + ",");
			if (right != null)
				inorderLeft(tree.right);
		}
	}

	public void inorderRight(Tree tree) {
		if (tree != null) {
			if (right != null)
				inorderRight(tree.right);
			System.out.print(tree.value + ",");
			if (left != null)
				inorderRight(tree.left);
		}
	}
}