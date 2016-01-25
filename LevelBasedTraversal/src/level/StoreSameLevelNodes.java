package level;

import java.util.ArrayList;
import java.util.LinkedList;

// The idea is to pass in the height of the tree during recursion and increment the height before examining left or right children.
public class StoreSameLevelNodes
{
	public <T> void getSameLevelNodes(ArrayList<LinkedList<Node<T>>> nodesOnSameLevel, Node<T> root, int level)
	{
		if (nodesOnSameLevel.isEmpty() || level + 1 > nodesOnSameLevel.size())
		{
			LinkedList<Node<T>> listOfNodes = new LinkedList<>();
			listOfNodes.add(root);
			nodesOnSameLevel.add(listOfNodes);
		}
		else
		{
			LinkedList<Node<T>> currentList = nodesOnSameLevel.get(level);
			currentList.add(root);
		}

		level++;
		if (root.getLeft() != null)
		{
			getSameLevelNodes(nodesOnSameLevel, root.getLeft(), level);
		}

		if (root.getRight() != null)
		{
			getSameLevelNodes(nodesOnSameLevel, root.getRight(), level);
		}
	}
}
