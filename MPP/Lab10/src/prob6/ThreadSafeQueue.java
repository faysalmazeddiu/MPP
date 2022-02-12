package prob6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeQueue {
	
	final Lock lock = new ReentrantLock();

	class Node {
		Object value;
		Node next;
	}

	private Node head;
	private Node tail;

	public synchronized void add(Object newValue) throws InterruptedException {
		lock.lock();
		try {
			Node n = new Node();
			if (head == null)
				head = n;
			else
				tail.next = n;
			tail = n;
			tail.value = newValue;
			System.out.println(tail.value);
		} finally {
			lock.unlock();
		}
	}

	public synchronized Object remove() throws InterruptedException {

		lock.lock();
		try {
			if (head == null)
				return null;
			Node n = head;
			head = n.next;
			return n.value;
		} finally {
			lock.unlock();
		}
	}
}
