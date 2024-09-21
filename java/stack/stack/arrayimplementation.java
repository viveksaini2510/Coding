package stack;



public class arrayimplementation {

    public static class Stack{
        private int arr[] = new int[5];
        private int idx =0;

        void push(int x){
            if(isfull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int size(){
            return idx;
        }

        void display(){
            for(int i=0 ; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isempty(){
            if(size()==0){
                return true;
            }
            return false;
        }

        boolean isfull(){
            if(idx==arr.length) return true;
            else return false;
        }

    }

    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 1 2
        System.out.println(st.size());
        st.push(7);
        st.push(2);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.push(9);
        st.display();

        

    }
}
