package questions;

public class delete_a_node {

    public static class node{
        
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        node head = null;
        node tail = null;
        int size =0;

        void insertatend(int val){
            node temp= new node(val);
            if(head==null){
                head =temp;
                
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertathead(int val){
            node temp = new node(val);
            if (head ==null) {
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int var){
            node t= new node(var);
            node temp = head;
            for(int i = 0 ; i< idx-1 ; i++){
                temp = temp.next;
            }
            if(idx==size){
                insertatend(var);
                return;
            }
            if(idx==0){
                insertathead(var);
                return;
            }
            if(idx < 0 || idx >size){
                System.out.println("Wrong index");
                return ;
            }
            t.next= temp.next;
            temp.next = t;
            size++;
        }

        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

      

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertathead(10);
        ll.insertAt(1,0);
        ll.insertAt(1, 25);
        
        ll.display();
    }
    
}
