package DSA.Stack;
import java.util.Stack;
public class pushAtBottomStack {

    public static void pushAtBottom(int data, Stack<Integer> st){
        
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();

        pushAtBottom(data, st);

        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(5);
        st.add(15);
        st.add(25);
       
        pushAtBottom(4, st);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        
    }
    
}
