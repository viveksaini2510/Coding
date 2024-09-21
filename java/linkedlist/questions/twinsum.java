package questions;

public class twinsum {

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

    public static int twinsum1(node head){
        int max = Integer.MIN_VALUE;
        node slow = head;
        node fast = head;
        while (fast.next!= null&& fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node temp = reverse(slow.next);
        slow.next=temp;
        node l = head;
        node r = slow.next;
        while(r!=null){
            if(l.val+r.val > max){
                max = l.val+r.val;
            }
            else{
              max=max;
            }
            l = l.next;
            r = r.next;
        }
        return max;
    }


    public static void main(String[] args) {
        node a = new node(30);
        node b = new node(15);
        node c = new node(10);
        node d = new node(11);
        node e = new node(5);
        node f = new node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(twinsum1(a));
        
    }
    
}
