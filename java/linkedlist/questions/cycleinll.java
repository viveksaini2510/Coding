package questions;

public class cycleinll {

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

    public static boolean cycle(node head){
        if(head==null) return false;
        if(head.next==null){
            return false;
        }
        node slow = head;
        node fast= head;
        while (fast!=null) {
            if(slow==null)return false;
            slow = slow.next;
            if(fast.next == null)return false;
            fast = fast.next.next;
        }
        if(fast == slow){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        node a = new node(100);
        node b = new node(13);
        node c = new node(4);
        node d = new node(5);
        node e = new node(12);
        node f = new node(10);
       // node g = new node(14);
        a.next = b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next= f;
        // f.next = b;

        System.out.println(cycle(a));
    }

}
