package Practise;

public class Linked_List {
	
	class Node{
		int Element;
		Node nextElem;
		
		public Node(int element, Node next){
			Element = element;
			nextElem= next;
		}		
	}
	
	private Node Head_of_LinkList;
	private Node Tail_of_LinkList;
	private int size_of_LinkList;
	
	public Linked_List() {
		Head_of_LinkList= null;
		Tail_of_LinkList= null;
		size_of_LinkList=0;
	}
	
	
	public String addNode_tail(int Element) {
        Node newest = new Node(Element, null);
        if(isEmpty())
            Head_of_LinkList = newest;
        else
            Tail_of_LinkList.nextElem = newest;
        Tail_of_LinkList = newest;
        size_of_LinkList = size_of_LinkList + 1;
        
        return "New Element "+ Element +"added at the head of the linked_list";
    }
	
	public String addNode_head(int Element) {
		Node newest = new Node(Element, null);
		if(isEmpty()) {
			Head_of_LinkList= newest;
			Tail_of_LinkList= newest;
		}
		else {
			newest.nextElem= Head_of_LinkList;
			Head_of_LinkList= newest;
		}
		size_of_LinkList= size_of_LinkList+1;
		
		return "New Element "+ Element +"added at the tail of the linked_list";
	}
	
	public String addNode_position(int Element, int position) {
		Node newest = new Node(Element, null);
		Node nd = Head_of_LinkList;
		int pos=1;
		while(pos< position-1) {
			nd= nd.nextElem;
			pos=pos+1;
		}
		newest.nextElem= nd.nextElem;
		nd.nextElem= newest;
		return "The new Element "+Element + "is added at "+ position;
		}
	
	public int length_of_LinkList() {
		return size_of_LinkList;
	}
	
	public boolean isEmpty() {
		return size_of_LinkList==0;
	}
	
	public int Search(int Key) {
		Node node = Head_of_LinkList;
        int index = 0;
        while(node!=null) {
            if(node.Element==Key)
                return index;
            node = node.nextElem;
            index = index + 1;
        }
        return -1;
		
	}
	
	public void display() {
        Node node = Head_of_LinkList;
        while(node!=null) {
            System.out.print(node.Element + "-->");
            node = node.nextElem;
        }
        System.out.println();
    }
	
		
	}

