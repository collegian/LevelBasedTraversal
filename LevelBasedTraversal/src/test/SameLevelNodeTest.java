package test;

import java.util.ArrayList;
import java.util.LinkedList;

import level.Node;
import level.StoreSameLevelNodes;

import org.junit.Test;

public class SameLevelNodeTest
{
	@Test
	public void testSameLevel()
	{
		StoreSameLevelNodes n = new StoreSameLevelNodes();

		Node<Integer> seven = new Node<>(null, null, 7);
		Node<Integer> six = new Node<>(null, null, 6);
		Node<Integer> five = new Node<>(null, null, 5);
		Node<Integer> four = new Node<>(null, null, 4);
		Node<Integer> three = new Node<>(six, seven, 3);
		Node<Integer> two = new Node<>(four, five, 2);
		Node<Integer> root = new Node<>(two, three, 1);

		ArrayList<LinkedList<Node<Integer>>> nodesOnSameLevel = new ArrayList<>();
		n.getSameLevelNodes(nodesOnSameLevel, root, 0);

		for (LinkedList<Node<Integer>> li : nodesOnSameLevel)
		{
			for (Node<Integer> i : li)
			{
				System.out.println(i.getData() + " ");
			}
			System.out.println(",");
		}
	}
}
