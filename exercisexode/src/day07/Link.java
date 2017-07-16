package day07;


public class Link {
	
	class Node{
		Object data;
		Node next;
		Node(Object obj){
			this.data = obj;
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}

	}
	
	Node header = null;
	
	void addNode(Object obj){
		Node node = new Node(obj);
		if(header == null){
			header = node;
			node.next =null;
		}
		else{
			Node temp = header;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
			node.next = null;
		}
	}
	
	
	void delet(Object obj){
		if(header ==null)
			throw new RuntimeException("null list !");
		Node temp = header;
		if(temp.data.equals(obj)){
			header = temp.next;
			header.next = temp.next.next;
		}
		while(temp.next != null){
			if(temp.next.data.equals( obj))
				temp .next= temp.next.next;
			else
				temp = temp.next;
		}


	}
	
	int size(){
		int num=0;
		Node temp = header;
		while(temp.next != null){
				num++;	
				temp = temp.next;
		}
		return num+1;
	}
	
	Node getNode(int i) {
		// TODO Auto-generated method stub
		if(i<0 ||i>size())
			throw new RuntimeException("out of index !");
		Node node = new Node();
		Node temp = header;
		if(i==0)
			return header;
		int count = 0;
		while(temp.next != null){

						count++;
			if(count==i){
				node = temp.next;
			}

			temp = temp.next;

		}
		
		return node;
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link = new Link();
		String[] str ={"1","2","3","4","5"};
        for(String s:str)
        	link.addNode(s);
        for (int i = 0; i < link.size(); i++) {
			        System.out.println(i +" ....= "+ link.getNode(i).data);
		}
        
        link.delet("3");
        link.delet("1");
        for (int i = 0; i < link.size(); i++) {
	        System.out.println(i +" = "+ link.getNode(i).data);
	        }

	}*/

}
