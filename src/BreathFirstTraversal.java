import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstTraversal {

	public static void main(String[] args) {

		int[][] g = { { 0, 1, 1, 0 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } };

		breadthFirst(g, 1);

	}

	// Function to perform breadth first traversal
	static void breadthFirst(int[][] matrix, int source) {

		// boolean array to hold visited nodes
		boolean visited[] = new boolean[matrix.length];

		// Queue to hold the track of nodes
		Queue<Integer> q = new LinkedList<Integer>();
		// add source node to queue
		q.add(source);
		// make source node as visited
		visited[source] = true;

		// do until queue become empty(all nodes are visited)
		while (!q.isEmpty()) {
			// take the next node from queue
			source = q.poll();
			// print that node
			System.out.print(source + "->");

			// for all nodes in matrix
			for (int i = 0; i < matrix.length; i++) {
				// if any node which is not previously visited and adjacent to current node
				if (!(visited[i]) && matrix[source][i] == 1) {
					// add those nodes to queue
					q.add(i);
					// make that nodes as visited
					visited[i] = true;
				}
			}
		}

	}
}
