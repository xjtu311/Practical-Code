package interview;

public class QueueJava {
	private static int qsize = 20;
	private int front = 0;
	private int next = 0;
	private int num;
	private Object[] obj;
	
	
	public QueueJava(){
		this(qsize);
	}
	public QueueJava(int num){
		this.num = num;
		obj = new Object[num];
	}
	
	public void addQueue(Object obj1){
		if(getSize() == qsize-1){
			throw new RuntimeException("full");
		}
		else{
			try{
			    obj[next] = obj1;
				next = (next+1)%qsize;
			}catch(RuntimeException e){
				e.printStackTrace();
			}
		}	
		
	}
	
	public Object delQueue(){
		if(front == next){
			throw new RuntimeException("empty");
			
		}else{
			Object obj1 = obj[front];
			obj[front] = null;
			front = (front+1)%qsize;
			return obj1;
		}
	}

	private int getSize() {
		// TODO Auto-generated method stub
		return (qsize + next - front)%qsize;
	}
	
	
	
	public static void main(String[] args) {
		QueueJava queue = new QueueJava();
		String[] q1={"a","b","c","d","e"};
		for(String s :q1){
			queue.addQueue(s);
		}
		
		queue.addQueue("off");

		Object del;
		del = queue.delQueue();
		
		while(queue.getSize() != 0){
			System.out.println( queue.delQueue() );
		}
	}

}
