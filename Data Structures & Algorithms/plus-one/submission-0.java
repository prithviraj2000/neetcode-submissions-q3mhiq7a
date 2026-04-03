class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        
        for(int i=digits.length-1;i>=0;i--){
            int sum=0;
            if(i==digits.length-1){
                sum=digits[i]+1+carry;
                carry=sum/10;
                sum=sum%10;
                digits[i]=sum;
            } else {
                sum=digits[i]+carry;
                carry=sum/10;
                sum=sum%10;
                digits[i]=sum;
            }
        }
        if(carry>0){
            int[] ans = new int[digits.length+1];
            ans[0]=carry;
            for(int i=0;i<digits.length;i++){
                ans[i+1]=digits[i];;
            }
            return ans;
        }
        return digits;
        
    }
}
