class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>slp= new Stack<>();
        Stack<Integer>str= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                slp.add(i);
            } else if(s.charAt(i)=='*'){
                str.add(i);
            } else {
                if(!slp.isEmpty()){
                    slp.pop();
                   
                } else if(!str.isEmpty()){
                    str.pop();
                } else{
                    return false;
                }
            }
        }
        //System.out.println(slp.size()+" "+str.size());
        while(!slp.isEmpty() && !str.isEmpty()){
            if(slp.peek()<str.peek()){
                slp.pop();
                str.pop();
            } else{
                return false;
            }
        }
        return slp.size()==0;

    }
}
