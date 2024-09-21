package questions;

public class findintersection {

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

    public static node intersaction(node head1 , node head2 ){
        int m = size(head1);
        int n = size(head2);
        node temp1 = head1;
        node temp2 = head2;
        if(m>n){ 
            for(int i=1; i<=m-n; i++){
                temp1 = temp1.next;
            }
        }
            
        else{
            for(int i=1; i<=n-m; i++){
                temp2 = temp2.next;
            }
        }
        
        for(int i = 0; i<size(head2) ; i++){
            if(temp1.data != temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                return temp1;
            }
        }
        return temp1;
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

        node g = new node(36);
        node h = new node(25);
        node i = new node(14);
        g.next = h;
        h.next = i;
        i.next = e;

        // System.out.println(size(a));
        // System.out.println(size(g));

        display(a);
        display(g);
        display(intersaction(a, g));
        
    }
}
