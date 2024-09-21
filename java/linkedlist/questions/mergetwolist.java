package questions;

public class mergetwolist {

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


    public static node mergelist(node h1 , node h2){
        node t1 = h1;
        node t2 = h2;
        node head = new node(100);
        node t = head;
        while(t1!=null&& t2!=null){
            if(t1.data< t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }     
        }
        if(t1 == null){
            t.next=t2;
        }
        else{
            t.next=t1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(3);
        node c = new node(5);
        node d = new node(7);
        node e = new node(11);
        node f = new node(20);
       // node g = new node(14);
        a.next = b;
        b.next=c;
        c.next= d;
        d.next=e;
        e.next= f;

        node g = new node(2);
        node h = new node(4);
        node i = new node(6);
        node j = new node(10);

        g.next = h;
        h.next = i;
        i.next = j;

        display(a);
        display(g);
        mergelist(a, g);
        display(a);


    }
    
}
