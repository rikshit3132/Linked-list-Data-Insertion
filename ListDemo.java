class Node{
	int data;
	Node next;
}
class Demo{
	Node head;
	public void insert(int data){
     Node node=new Node();
     node.data=data;
     node.next=null;
     if(head==null){
     	head=node;
     }
     else{
     	Node n=head;
     	while(n.next!=null){
     		n=n.next;
     	}
     	n.next=node;
     }
 }
     public void display(){
     	 Node node=head;
     	 while(node.next!=null){
     	 	System.out.println(node.data);
     	 	node=node.next;
     	 }
     	 System.out.println(node.data);
     	}
}
public class ListDemo{
	public static void main(String args[]){
		Demo d1=new Demo();
		d1.insert(5);
		d1.insert(6);
		d1.insert(7);
		d1.insert(8);
		d1.display();
		
		

	}

}