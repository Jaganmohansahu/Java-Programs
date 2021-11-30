//A Queue with Integer objects
import java.util.*;
class QueueDemo
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();

		for(int i=1; i<=5; i++)
		q.offer(i);

		System.out.println("The queue is: ");	
		while(!q.isEmpty())
			System.out.println(q.poll());
	}
}