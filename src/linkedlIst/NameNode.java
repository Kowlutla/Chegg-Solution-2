package linkedlIst;

public class NameNode {
	
	private String name;
	private NameNode nextNode;
	public NameNode(String name, NameNode nextNode) {
		this.name = name;
		this.nextNode = nextNode;
	}
	
	public NameNode(String name)
	{
		this(name,null);
	}
	
	public String getName()
	{
		return name;
	}
	
	public NameNode getNode()
	{
		return nextNode;
	}
	
	public void setNode(NameNode newNode)
	{
		this.nextNode=newNode;
	}
}
