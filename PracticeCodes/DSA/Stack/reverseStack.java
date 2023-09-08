package DSA.Stack;


import java.util.Stack;

//Time complexity is (n^2)
public class reverseStack {

    public static void pushAtBottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }

    public static void revStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        revStack(st);
        pushAtBottom(top, st);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);

      
        revStack(st);
        // pushAtBottom(10, st);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    
}
