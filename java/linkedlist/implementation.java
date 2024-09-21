public class implementation {

    public static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;

        }
    }

    public static class linkedlist{
        node head = null;
        node tail = null;

        void insertatend(int val){
            node temp= new node(val);
            if(head==null){
                head =temp;
                
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }

        int size(){
            int count = 0;
            node temp = head;
            while (temp!=null) {
                count++;
                temp= temp.next;
            }
            return count ;
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
        }

        void insertAt(int idx, int var){
            node t= new node(var);
            node temp = head;
            for(int i = 0 ; i< idx-1 ; i++){
                temp = temp.next;
            }
            if(idx==size()){
                insertatend(var);
                return;
            }
            if(idx==0){
                insertathead(var);
                return;
            }
            if(idx < 0 || idx >size()){
                System.out.println("Wrong index");
                return ;
            }
            t.next= temp.next;
            temp.next = t;
        }

        int getat(int idx){
            if(idx < 0 || idx >size()){
                System.out.println("Wrong index");
                return -1;
            }
            node temp = head;
            for (int i = 1; i<=idx; i++){
                temp= temp.next;
            }
            return temp.data;
        }


        void deleteat(int idx){
            node temp  = head;
            if(idx == 0){
                head = head.next;
                return;
            }
            for(int i = 0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertathead(10);
        ll.insertatend(5);
        ll.insertatend(6);
       // ll.display();
        ll.insertatend(12);
        //ll.display();
        ll.insertathead(13);
       // ll.display();
        ll.insertAt(5, 14);

       // ll.display();
        ll.insertAt(0, 25);
        ll.display(); 
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);
        // System.out.println(ll.getat(0));
        // System.out.println(ll.getat(1));
        // System.out.println(ll.getat(2));
        // System.out.println(ll.getat(3));
        // System.out.println(ll.getat(4));
        ll.deleteat(1);
        ll.display();
        ll.deleteat(0);
        ll.display();
        // System.out.println(ll.tail.data);
    }
    
}
