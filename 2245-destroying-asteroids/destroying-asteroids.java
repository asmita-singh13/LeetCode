import java.util.*;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       Arrays.sort(asteroids) ;
       double m=mass;
       for(int a: asteroids){
        if(m<a){
            return false;

        }
        else{
            m+=a;
        }

       }
       return true;
    }
}