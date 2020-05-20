<<<<<<< HEAD
<<<<<<< HEAD
//QUEUE
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Example
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();	//upcasting
		q.add(11);
		q.add(21);
		q.add(31);
		System.out.println(q);

		Deque dq = new LinkedList();	//not generic so warning; so not possible to sort
		dq.add(1.0);
		dq.addFirst("A");
		dq.add(55);
		dq.add(55);
		dq.addLast(66);
		System.out.println(dq);

		q.remove();
		dq.removeLastOccurance(55);
		dq.removeLast();
		System.out.println(q);
		System.out.println(dq);
	}
=======
//QUEUE
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Example
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();	//upcasting
		q.add(11);
		q.add(21);
		q.add(31);
		System.out.println(q);

		Deque dq = new LinkedList();	//not generic so warning; so not possible to sort
		dq.add(1.0);
		dq.addFirst("A");
		dq.add(55);
		dq.add(55);
		dq.addLast(66);
		System.out.println(dq);

		q.remove();
		dq.removeLastOccurance(55);
		dq.removeLast();
		System.out.println(q);
		System.out.println(dq);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//QUEUE
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Example
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<Integer>();	//upcasting
		q.add(11);
		q.add(21);
		q.add(31);
		System.out.println(q);

		Deque dq = new LinkedList();	//not generic so warning; so not possible to sort
		dq.add(1.0);
		dq.addFirst("A");
		dq.add(55);
		dq.add(55);
		dq.addLast(66);
		System.out.println(dq);

		q.remove();
		dq.removeLastOccurance(55);
		dq.removeLast();
		System.out.println(q);
		System.out.println(dq);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}