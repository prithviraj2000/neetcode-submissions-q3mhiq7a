class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(String x : tokens){
            if(x.equals("+")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                System.out.println(a+" "+b);
                s.push(a+b);
            } else if(x.equals("-")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                System.out.println(a+" "+b);
                s.push(b-a);
            } else if(x.equals("*")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                System.out.println(a+" "+b);
                s.push(a*b);
            } else if(x.equals("/")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                System.out.println(a+" "+b);
                s.push(b/a);
            } else {
                s.push(Integer.valueOf(x));
            }
        }
        return s.peek();
    }
}
