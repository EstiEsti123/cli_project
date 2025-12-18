import java.util.Scanner;

public class mainNode {

   public static void func1(queue q) {
	   stack s=new stack();
	   while(!q.isEmpty()) {
		 s.push(q.remove());  
	   }
	   while(!s.isEmpty())
		   q.insert(s.pop());
	   
   }

	public static void print(queue q) {
		queue q2 = new queue();
		while (!q.isEmpty()) {
			System.out.print(q.head() + ", ");
			q2.insert(q.remove());
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());}
		}

	public static void print(stack  s) {
		stack temp = new stack();
		while (!s.isEmpty()) {
			System.out.print(s.top()+",");
			temp.push(s.pop());
		}

		while (!temp.isEmpty())
			s.push(temp.pop());
	}
	
	
	
	public static int last(stack s) {
    stack tempStack = new stack();
    int last = 0;

    // הוצאת כל האיברים ושמירת האחרון
    while (!s.isEmpty()) {
        last = s.pop();
        tempStack.push(last);
    }

    // החזרת המחסנית למצב המקורי
    while (!tempStack.isEmpty()) {
        s.push(tempStack.pop());
    }

    return last;
}
     

	public static stack BuildStack() {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("input num");
		num = s.nextInt();
		stack  st = new stack();
		while (num != -1) {
			st.push(num);
			System.out.println("input num");
			num = s.nextInt();
		}
		return st;
	}

	public static boolean ifEqual(stack s) {
		int sum1 = 0, sum2 = 0, count = 0;
		stack ns = new stack();
		while (!s.isEmpty()) {
			if (count % 2 == 0)
				sum1 += s.top();
			if (s.top() % 2 == 0)
				sum2 += s.top();
			ns.push(s.top());
			s.pop();
			count++;
		}
		return sum1 == sum2;
	}

//	public static boolean isSort(stack<Integer> s) {
//		stack<Integer> ns = new stack<>();
//		ns.push(s.top());
//		int temp = s.pop();
//		while (!s.isEmpty()) {
//			if (s.top() < temp)
//				return false;
//
//			else {
//				ns.push(s.top());
//				temp = s.pop();
//			}
//		}
//		return true;
//	}
//
//	public static void insert(stack<Integer> s, int num) {
//		boolean flag = true;
//		stack<Integer> ns = new stack<>();
//		while (!s.isEmpty() && flag) {
//			if (num < s.top())
//				ns.push(s.pop());
//
//			else {
//				ns.push(num);
//				flag = false;
//			}
//		}
//		if (num < ns.top())
//			ns.push(num);
//		while (!ns.isEmpty())
//			s.push(ns.pop());
//
//	}
//
//	public static boolean allZugi(stack<Integer> s) {
//		stack<Integer> ns = new stack<>();
//		int num = s.top() % 2;
//		while (!s.isEmpty()) {
//			if (s.top() % 2 != num)
//				return false;
//			ns.push(s.pop());
//		}
//		return true;
//	}
//
//	public static boolean isPalindrom(stack<Integer> s) {
//		stack<Integer> ns = new stack<>(), s2 = new stack<>();
//
//		while (!s.isEmpty()) {
//			s2.push(s.top());
//			ns.push(s.pop());
//		}
//		while (!s2.isEmpty()) {
//
//			s.push(s2.pop());
//		}
//		while (!s.isEmpty()) {
//			if (s.pop() != ns.pop())
//				return false;
//
//		}
//		return true;
//	}
//
//	public static stack<Integer> ex(stack<Integer> s1, stack<Integer> s2) {
//		int sum1 = 0, sum2 = 0;
//		stack<Integer> ns = new stack<>();
//		while (!s1.isEmpty()) {
//			sum1 = (sum1 * 10) + s1.pop();
//		}
//		while (!s2.isEmpty()) {
//			sum2 = (sum2 * 10) + s2.pop();
//		}
//		sum1 += sum2;
//		while (sum1 > 0) {
//			ns.push(sum1 % 10);
//			sum1 /= 10;
//		}
//		print(ns);
//		return ns;
//	}
//
//	public static boolean isValid(String s) {
//		stack<Character> ns = new stack<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
//				ns.push(s.charAt(i));
//			else if (s.charAt(i) == ')' && !ns.isEmpty()) {
//				if (ns.pop() != '(')
//					return false;
//			} else if (s.charAt(i) == '}' && !ns.isEmpty()) {
//				if (ns.pop() != '{')
//					return false;
//			} else if (s.charAt(i) == ']' && !ns.isEmpty()) {
//				if (ns.pop() != '[')
//					return false;
//			}
//		}
//		if (!ns.isEmpty())
//			return false;
//		return true;
//	}
//
//	public static int postFix(String s) {
//		stack<Integer> ns = new stack<Integer>();
//		int temp = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
//				ns.push(s.charAt(i) - '0');
//			else {
//				switch (s.charAt(i)) {
//				case '+':
//					temp = ns.pop() + ns.pop();
//					break;
//				case '-':
//					temp = ns.pop() - ns.pop() * -1;
//					break;
//				case '*':
//					temp = ns.pop() * ns.pop();
//					break;
//				case '/':
//					temp = ns.pop() / ns.pop();
//					break;
//
//				}
//
//				ns.push(temp);
//				temp = 0;
//
//			}
//
//		}
//
//		return ns.top();
//	}
//	public static int ex4(stack<Integer> s1, stack<Integer> s2) {
//		int sum1 = 0, sum2 = 0;
//		stack<Integer> ns = new stack<>();
//		while (!s1.isEmpty()) {
//			sum1 = (sum1 * 10) + s1.pop();
//		}
//		while (!s2.isEmpty()) {
//			sum2 = (sum2 * 10) + s2.pop();
//		}
//		if(sum1>sum2)
//			return -1;
//		else if(sum1==sum2)
//			return 0;
//		else
//			return 1;
//		
//	}
//	public static stack<Integer> ex6 (stack<Integer> s){
//		stack<Integer> ns = new stack<Integer>(),ns2 = new stack<Integer>();
//		while(!s.isEmpty()) {
//			if(s.top()>=0)
//				ns.push(s.pop());
//			else
//				ns2.push(s.pop());
//		}
//		while(!ns2.isEmpty()) {
//			s.push(ns2.pop());
//		}
//		while(!ns.isEmpty()) {
//			s.push(ns.pop());
//		}
//		print(s);
//		return s;
//	}
//	public static void ex7(stack<Integer> s){
//		stack<Integer> ns = new stack<Integer>();
//		int count=1;
//		while(!s.isEmpty()) {
//			int ez=s.pop();
//		while(!s.isEmpty()&&ez==s.top()) {
//			count++;
//			s.pop();
//		}
//		ns.push(ez*count);
//		count=1;
//		}
//		print(ns);
//	}
//	public static stack<Integer> ex9(stack<Integer>s){
//		stack ns = new stack();
//		int n1=0,n2=2;
//		while(!s.isEmpty()) {
//			n1=s.top();
//		if(n1>s.pop()) {
//			
//		}
//		}
//	}
	public static void main(String[] args) {
		 stack s =BuildStack();
		 queue q=new queue();
		 q.insert(53);
		 q.insert(1);
		 q.insert(7);
		 
		 s.push(5);
		 s.push(8);
		 s.push(3);
		 //System.out.println(s.top()+"");
		 print(s);
		
		 System.out.println();
		 System.out.println(last(s));
		 System.out.println();
		 print(q);
		 System.out.println();  
		 func1(q);
		 
		 print(q);
		 
		// System.out.println(isValid("(2*3)"));
		//System.out.println(postFix("34+5*235+*+"));
	//System.out.println(ex4(s,s1));
		 
	   //ex7(s);

		// System.out.println(ifEqual(s));
		// System.out.println(isSort(s));
		// insert(s, 5);
		// System.out.println(allZugi(s));
		// System.out.println(isPalindrom(s));
		// print(s);

	}

}



