
public class stack {
	
	private Node  first;

	public stack()
	{
		first=null;
	}

	public void push(int val)
	{
		if(first==null)
		{
			first=new Node(val);
			
		}
		else
		{
			Node q =new Node (val,first);
			first=q;
			
		}
	}

	public int pop()
	{
		int val=first.getValue();
		first=first.getNext();
		return val;
	}

	public int top()
	{
		return first.getValue();
	}
	public boolean isEmpty()
	{
		return first==null;
	}

	}


