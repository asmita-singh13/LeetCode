class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int y=x;
            int z=0;
            while(x!=0){
                z=(z*10)+(x%10);
                x/=10;
            }
            if(z==y){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}