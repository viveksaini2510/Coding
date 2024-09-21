package questions;

public class reversell {

    public static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
    }

    public static void display(node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static void reversedisplay(node head){
        if(head==null) return;
        reversedisplay(head.next);
        System.out.print(head.val+" ");
    }

    public static node reverse(node head){
        if(head.next==null){
            return head;
        }
        node newhead = reverse(head.next);
        head.next.next= head;
        head.next=null;
        return newhead;

    }


    public static void main(String[] args) {
        node a = new node(3);
        node b = new node(5);
        node c = new node(1);
        node d = new node(2);
        node e = new node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        
        display(a);
        System.out.println();
        // reversedisplay(a);

        a= reverse(a);
        display(a);
    }
    
}
