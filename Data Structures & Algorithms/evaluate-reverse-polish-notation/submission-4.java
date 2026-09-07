class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int a,b;
        for(String x: tokens){
            if(x.equals("*")){
                a = st.peek();
                st.pop();
                b = st.peek();
                st.pop();
                st.push(a*b);
            } else if(x.equals("+")){
                a = st.peek();
                st.pop();
                b = st.peek();
                st.pop();
                st.push(a+b);
            } else if(x.equals("-")){
                a = st.peek();
                st.pop();
                b = st.peek();
                st.pop();
                st.push(b-a);
            } else if(x.equals("/")){
                a = st.peek();
                st.pop();
                b = st.peek();
                st.pop();
                st.push(b/a);
            } else{
                st.push(Integer.valueOf(x));
            }
        }
        return st.peek();
    }
}
