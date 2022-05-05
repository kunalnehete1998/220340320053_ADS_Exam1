class Q3StackUsingArray{
	int[] arr;
	int top1;
	int top2;
	int capacity;
	int count1 = 0;
	int count2 = 0;
	Q3StackUsingArray(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top1 = -1;
		top2 = capacity ;
		for(int i = 0;i<capacity;i++){
			arr[i] = -1;
		}
	}
	void push1(int data){
		if(top1 == capacity / 2){
			System.out.println("The Stack is full");
			return;
		}else{
			top1++;
			arr[top1] = data;
			count1++;
		}
	}
	void push2(int data){
		if(top2 == capacity/2 + 1){
			System.out.println("The Stack is full");
			return ;
		}else{
			arr[capacity-1] = data;
			capacity--;
			count2 = capacity;
		}
	}
	
	int pop1(){
		if(top1 == -1){
			System.out.println("The Stack1 is Empty");
			return -1;
		}else{
			int res = arr[top1];
			for(int i = 0;i<count1;i++){
				arr[i] = arr[i+1];
			}
			return res;
		}
	}
	int pop2(){
		if(top2 == capacity){
			System.out.println("The Staack2 is Empty");
			return -1;
		}else{
			int res = arr[capacity];
			for(int j = count2 ; j<capacity;j++){
				arr[j+1] = arr[j];
			}
			return res;
		}
	}
	public static void main(String... args){
		Q3StackUsingArray q= new Q3StackUsingArray(9);
		q.push1(5);
		q.push2(10);
		q.push2(15);
		q.push1(11);
		q.push2(7);
		q.push2(40);
		System.out.println("Popped element from stack1 is "+q.pop1());
		System.out.println("Popped element from stack2 is "+q.pop2());
	}
}