package linkedlist;

public class basicll {

    public static void insertatend(node head, int val){
        node temp = new node(val);
        node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;

    }

    public static void display(node head){
        node temp= head;
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println();
    }



    public static void displayR(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }


    public static int length(node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    

    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

       node a = new node(2);
      
       node b = new node(3);
       node c = new node(4);
       node d = new node(5);
       node e = new node(6);
       node f = new node(7);
       a.next = b;
       b.next= c;
       c.next = d;
       d.next = e;
       e.next =f;
        // node temp=a;
    //    for(int i=0;i<6;i++){
    //     System.out.print(temp.data + "->");
    //     temp = temp.next;
    //    }
    //    while(temp!=null){
    //     System.out.print(temp.data+" ");
    //     temp= temp.next;
    //    }

    // displayR(b);
    // displayR(a);
    // displayR(c);
    System.out.println(length(a));
    insertatend(a,78);
    display(a);
}
}
