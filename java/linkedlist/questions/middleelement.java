package questions;

public class middleelement {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }

    public static int size(node head){
        node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void display(node head){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int middle(node head){
        node slow = head;
        node fast = head;
        while (fast!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
              
        }
        return slow.data;
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
        //f.next = g;

        display(a);
        System.out.println(middle(a));

    }
    
}
