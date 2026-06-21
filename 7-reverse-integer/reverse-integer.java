class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if(x>0){
            
        return rev( x);
        
    }
    if(x==0){
        return 0;
    }
    else{
        int m=-x;
        int d= rev( m);
        return -d;

    }
    }
    public int rev(int x){

            int a=0;
            int b=x;
            while(b!=0){
                int c=b%10;
                if (a > Integer.MAX_VALUE / 10 || (a == Integer.MAX_VALUE / 10 && c > 7)) {
                return 0;
            }
                a=(a*10)+c;
                b/=10;
            }
        return a;
}
}