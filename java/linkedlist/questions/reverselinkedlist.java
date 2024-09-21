package questions;

public class reverselinkedlist {

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

    public static node reverse(node head){
        node curr = head;
        node prev = null;
        node agla = null;
        
        while (curr!=null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            
        }
        return prev;
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
        System.out.println("The revere is:");
        reverse(a);
        display(e);
    }
    
}
