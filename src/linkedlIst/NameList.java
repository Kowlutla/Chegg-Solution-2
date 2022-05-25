package linkedlIst;

public class NameList {

	private NameNode node;

	public NameList() {
		node = null;
	}

	public boolean isEmpty() {
		return (node == null);
	}

	public void append(NameNode newNode) {
		NameNode temp = this.node;
		if (temp == null) {
			node = newNode;
			return;
		}
		while (temp.getNode() != null) {
			temp = temp.getNode();
		}
		temp.setNode(newNode);

	}

	public String toString() {
		NameNode temp = this.node;
		String lString = "";
		do {
			lString += temp.getName() + "\n";
			temp = temp.getNode();
		} while (temp != null);
		return lString;
	}

	/*
	 * returns true if the provided name exists in the list, otherwise returns false
	 */
	public boolean contains(String name) {
		NameNode temp = this.node;
		while (temp != null) {
			if (temp.getName().equals(name)) {
				return true;
			}
			temp = temp.getNode();
		}
		return false;
	}

	/*
	 * adds name to the list in its proper lexicographical (alphabetical) ordering
	 */
	public void add(String name) {
		NameNode newNode = new NameNode(name);
		if (isEmpty()) {
			this.node = newNode;
			return;
		}
		if (this.node.getName().compareTo(name) > 0) {
			newNode.setNode(node);
			this.node = newNode;
			return;
		}
		NameNode temp = this.node;
		while (temp.getNode() != null && !(temp.getNode().getName().compareTo(name) < 0)) {
			temp = temp.getNode();
		}
		newNode.setNode(temp.getNode());
		temp.setNode(newNode);
	}

	/*
	 * removes name from list
	 */
	public void delete(String name) {
		if (isEmpty()) {
			return;
		}
		if (this.node.getName().equals(name)) {
			this.node = this.node.getNode();
			return;
		}
		NameNode temp = this.node;
		NameNode prev = null;
		while (temp != null && !(temp.getName().equals(name))) {
			prev = temp;
			temp = temp.getNode();
		}
		if (temp == null) {
			return;
		}
		prev.setNode(temp.getNode());
	}
}
