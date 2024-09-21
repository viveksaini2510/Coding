package questions;

public class palindrome {

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

    public static boolean ispalindrome(node head){
        node slow = head;
        node fast = head;
        while (fast.next!=null&&fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        node temp = reverse(slow.next);
        slow.next = temp;
        node p1= head;
        node p2 = slow.next;
        while (p2!=null) {
            if(p1.val != p2.val) return false;
        p1 = p1.next;
        p2 = p2.next;
        }
        return true; 
    }
    

    public static void main(String[] args) {
        node a = new node(3);
        node b = new node(5);
        node c = new node(1);
        node d = new node(1);
        node e = new node(5);
        node f = new node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(ispalindrome(a));

        
    }
    
}
