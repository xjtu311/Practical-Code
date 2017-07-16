package day07;

public class Connection {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection link = new Connection();
		Connection link1 = new Connection();
		String[] str ={"1","2","3","4","5"};
        for(String s:str)
        	link.addNode(s);

        String[] str1 ={"7","6","8","4","9"};
        for(String s:str1)
        	link1.addNode(s);


/*       for (int i = 0; i < link.size(); i++) {
			System.out.println(link.getNode(i).data);
		}*/
        
		System.out.println("......."+isConnection(link,link1).data);
			
/*		for(int i= link.size()-1;i>=0;i--)
			System.out.print(link.getNode(i).data+" ");*/

	}
	
	static Node isConnection(Connection c1,Connection c2){
		int len1 = c1.size();
		int len2 = c2.size();
		if(len1==0 || len2==0) 
			throw new RuntimeException("empty link !");
		int index=0;
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if(c1.getNode(i).data.equals(c2.getNode(j).data)){
					index = i;
					return c1.getNode(index);
				}
									
			}

		}		
		throw new RuntimeException("no connect node !");
		
	}
	
	



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
		while(temp.next.data != obj)
			temp = temp.next;
		temp = temp.next.next;
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
	

}
