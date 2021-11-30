//STACK
import java.util.Stack;
class Example
{
	public static void main(String[] args) 
	{
		Stack<Double> st = new Stack<Double>();
		System.out.println(st.empty());	

		st.push(1.2);
		st.push(2.2);
		st.push(3.2);

		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.search(1.2));
	}
}