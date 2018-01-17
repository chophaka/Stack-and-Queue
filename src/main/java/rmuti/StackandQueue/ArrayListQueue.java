package rmuti.StackandQueue;

import java.util.ArrayList;

public class ArrayListQueue {

	private ArrayList lst;
	public ArrayListQueue() {
		lst = new ArrayList();
	}
	public Object peek () {
		return lst.get(0);
	}
	public Object dequeue() {
		Object obj = lst.get(0);
		lst.remove(0);
		return obj;
	}
	public void enqueue(Object e ) {
		lst.add(e);
	}
	@Override
	public String toString() {
		return lst.toString();
		
	}

	

}
