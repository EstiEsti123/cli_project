//import quehe.Node;
public class queue {
private Node head,last;


		public queue() {
			this.head = null;
			this.last=null;
		}

		public void insert(int val) {
			if (head == null) {
				head = new Node (val);
			    last=head;}
			else {
			Node q =new Node(val);
	        last.setNext(q);
	        last=last.getNext();
			}
		}
		public int remove() {
		int val=head.getValue();
		head=head.getNext();
		return val;
			
		
		}
		public int head() {
			return head.getValue();
		}
		public boolean isEmpty()
		{
			return head==null;
		}

		

	}


