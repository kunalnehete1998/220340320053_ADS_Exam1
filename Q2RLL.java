import java.util.Scanner;
class Q2RLL{
	node head;
	class node{
		int data;
		node next;
		node(int data ){
			this.data = data;
			next = null;
		}
	}
	node createnode(int data){
		return new node(data);
	}
	void addlast(int data){
		node trav, newnode;
		newnode = createnode(data);
		if(head == null){
			head = newnode;
		}else{
			trav = head;
			while(trav.next!=null){
				trav = trav.next;
			}
			trav.next = newnode;
		}
	}
	void display(){
		node trav;
		trav = head;
		while(trav!=null){
			System.out.print(trav.data+"  ");
			trav = trav.next;
		}
		System.out.println();
	}
	node reverse(){
		node trav, ptrnext, ptrprev;
		trav = head;
		ptrnext = null;
		ptrprev = null;
		while(trav!=null){
			ptrnext = trav.next;
			trav.next = ptrprev;
			ptrprev = trav;
			trav = ptrnext;
		}
		head = ptrprev;
		return head;
	}
	public static void main(String... args){
		Q2RLL q = new Q2RLL();
		Scanner sc = new Scanner(System.in);
		System.out.print(" test cases : ");
		int t = sc.nextInt();
		int i = 1;
		while(i<=t){
			System.out.print("no of element : ");
			int n = sc.nextInt();
			for(int j = 1;j<=n;j++){
				int num = sc.nextInt();
				if(j==1){
					q.head = q.createnode(num);
				}else{
					q.addlast(num);
				}
			}
			i++;
			q.head = q.reverse();
			q.display();
		}
		// q.display();
		
	}
}