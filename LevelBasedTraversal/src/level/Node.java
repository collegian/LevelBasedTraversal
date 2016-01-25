package level;

public class Node<T>
{
	private final Node<T> left, right;
	private final T data;

	public Node(Node left, Node right, T data)
	{
		this.left = left;
		this.right = right;
		this.data = data;
	}

	public Node<T> getLeft()
	{
		return left;
	}

	public Node<T> getRight()
	{
		return right;
	}

	public T getData()
	{
		return data;
	}
}
