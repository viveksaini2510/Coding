package questions;

public class findnode {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;

        }
    }

    public static void display(node head){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static node nthnode2(node head , int n){
        node slow = head;
        node fast = head;
        for(int i =1 ; i <= n ; i++){
            fast= fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static node deletefromend(node head , int n ){
        node slow = head;
        node fast = head;
        for (int i = 1 ;i <= n ; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    

    public static void main(String[] args) {

        node a = new node(100);
        node b = new node(13);
        node c = new node(4);
        node d = new node(5);
        node e = new node(12);
        node f = new node(10);
        a.next = b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next= f;

        // node temp = nthnode2(a, 2);
        // System.out.println(temp.data);

        display(a);
        a=deletefromend(a, 6);
        display(a);


        
    }
}
