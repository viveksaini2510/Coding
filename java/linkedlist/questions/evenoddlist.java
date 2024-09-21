package questions;

public class evenoddlist {

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

    public static node oddeven(node head){
        node temp = head;
        node odd = new node(0);
        node even = new node(0);
        node te = even;
        node to = odd;
        while (temp!=null) {
            to.next = temp;
            temp = temp.next;
            to = to.next;

            te.next = temp;
            if(temp ==null) break;
            temp = temp.next;
            te = te.next;

        }
        odd = odd.next;
        even = even.next;
        to.next = even;


        return head;
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(11);
        node c = new node(1);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.out.println();
        oddeven(a);
        display(a);
    }    
}
