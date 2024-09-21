package questions;

public class randompointer {

    public static class node{
        int val;
        node next;
        node random;
        node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void display(node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static node copyrandomlist(node head){
        
        // creating deep copy 

        node head2 = new node(0);
        node temp2 = head2;
        node temp1 = head;
        while(temp1!= null){
            node t = new node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // building alternate connection 
        node temp = new node(0);
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;      
        }
        temp2 = head2;
        temp1 = head;

        // assigning random pointer 

        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp1!=null) temp2 = temp1.next;
        }
        temp2 = head2;
        temp1 = head;

         //separating the list 
        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1 ==null)break;
            temp2.next= temp1.next;
            if(temp2.next == null) break;
            temp2 = temp2.next;
            
        }
        return head2;

    }

    public static void main(String[] args) {
        node a = new node(7);
        node b = new node(13);
        node c = new node(11);
        node d = new node(10);
        node e = new node(1);
       // node f = new node(0);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       // e.next = f;


       display(a);
       System.out.println();
       copyrandomlist(a);
       display(a);
    }
    
}
