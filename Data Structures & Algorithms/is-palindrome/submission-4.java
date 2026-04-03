class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        System.out.println(s);
        int i=0,j=s.length()-1;
        while(i<=j){
            while(i<=j && (s.charAt(i)>'9'||s.charAt(i)<'0')
                &&(s.charAt(i)>'z'||s.charAt(i)<'a')){
                    i++;
            } 
            while(i<=j && (s.charAt(j)>'9'||s.charAt(j)<'0')
                &&(s.charAt(j)>'z'||s.charAt(j)<'a')){
                    j--;
            }
            if(i<=j && s.charAt(i)!=s.charAt(j)){
                System.out.println(i +" "+ s.charAt(i)+" "+j+ " "+s.charAt(j));
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
