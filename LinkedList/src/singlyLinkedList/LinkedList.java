package singlyLinkedList;

public class LinkedList {
	protected Node start;
	protected Node end;
	public int size;

	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}



	public Node getStart() {
		return start;
	}



	public void insertAtBegin(int value) {

		Node newNode = new Node(value);

		if (start == null) {
			start = newNode;
			end = start;
		} else {
			newNode.setNext(start);
			start = newNode;
		}
		size++;
		System.out.println("node" + value + " has added at beginning");
	}

	public void insertAtEnd(int value) {

		Node newNode = new Node(value);

		if (start == null) {
			start = newNode;
			end = start;
		} else {
			
			end.setNext(newNode);
			end=newNode;
		}
		size++;
		System.out.println("node" + value + " has added at the end");
	}

	
	public void insertAtPosition(int value, int position) {
		if (position == 1) {
			insertAtBegin(value);
		}
		if(position>size) {
			insertAtEnd(value);
		}

		Node newNode = new Node(value);

		Node temp = start;
		int count = 0;
		while (count < position - 2 && temp.getNext() != null) {
			temp = temp.next;
			count++;

		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		size++;
		System.out.println("Node" + value + " has been added on " + position + " position");

	}

	public boolean isEmpty() {
		return start==null;
	}


	public void display() {
			
		if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getNext()== null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node temp=start;
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+"-->");
			temp=temp.getNext();
		}
		System.out.print(temp.getData());
		
	}
	
	public void deleteAtPosition(int position) {
		if(position==1) {
			start=start.getNext();
			size--;
			System.out.println("First record has been deleted");
			return;
		}
		
		if(position==size) {
			Node temp=start;
			Node prev=null;
			while(temp.getNext()!=null) {
				prev=temp;
				temp=temp.getNext();
			}
			end=prev;
			end.setNext(null);
			size--;
			System.out.println("last record has been deleted");
			return;
		}
		Node temp=start;
		int count=0;
		while( count<position-2 &&  position<size && temp.getNext()!=null) {
			temp=temp.getNext();
			count++;
		}
		size--;
		temp.setNext(temp.getNext().getNext());
		System.out.println("record has been deleted on "+position+" positions");
		
		
	}

}
