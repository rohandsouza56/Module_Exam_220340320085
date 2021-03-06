
class Stack{
	int max = 10;
	int arr[] = new int[max];
	int top1;
	int top2;
	
	Stack(){
		top1 = -1;
		top2 = max;
	}
	
	
	void push1(int element){
		if(isFull()){
			System.out.println("Stack 1 is full");
			return;
		}
		arr[++top1] = element;
		
	}
	
	void push2(int element){
		if(isFull()){
			System.out.println("Stack 2 is full");
			return;
		}
		arr[--top2] = element;
		
	}
	
	int pop1(){
		if(isEmpty1()){
			System.out.println("Stack 1 is empty");
			return -1;
		}
		int x = arr[top1--];
		return x;
	}
	
	int pop2(){
		if(isEmpty2()){
			System.out.println("Stack 2 is full");
			return -1;
		}
		int x = arr[top2++];
		return x;
	}
	
	boolean isEmpty1(){
		if(top1==-1){
			return true;
		}
		return false;
	}
	
	boolean isEmpty2(){
		if(top2==max){
			return true;
		}
		return false;
	}
	boolean isFull(){
		if(top1==top2){
			return true;
		}
		return false;
	}
	
	int peek1(){
		if(isEmpty1()){
			return -1;
		}
		return arr[top1];
	}
	int peek2(){
		if(isEmpty2()){
			return -1;
		}
		return arr[top2];
	}
	
	
	void display1(){
		System.out.println("Stack 1 elements: ");
		for(int i = top1;i>-1;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void display2(){
		System.out.println("Stack 2 elements: ");
		for(int i = top2;i<max;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String agrs[]){
		Stack s = new Stack();
		
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		s.display1();
		s.display2();
		
		System.out.println("Popped element from stack 1 is "+s.pop1());
		System.out.println("Popped element from stack 2 is "+s.pop2());
		
		s.display1();
		s.display2();
		
		System.out.println("Current pointer to stack 1 is "+s.peek1());
		System.out.println("Current pointer to stack 2 is "+s.peek2());
	}
}