class Solution {
    public boolean isPalindrome(String s) {
        String S = s.toLowerCase().replaceAll("[^a-z0-9]",""); 
        return isPal(S,0,S.length()-1);
    }
    private boolean isPal(String s,int L, int R){
        
        if(L>=R) return true;
        if(s.charAt(L)==s.charAt(R)) return isPal(s,L+1,R-1);
        return false;    
    }
}