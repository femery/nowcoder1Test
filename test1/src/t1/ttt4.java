package t1;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: hsx
 * @Date: 2020/3/9
 * @Description: t1
 * @version: 1.0
 */
public class ttt4 {
    public static void main(String[] args) {
        int[] res={1,3,6,5,3,2,1};
        Set<Integer> set =new HashSet<>();
        for(int i:res){
            if(set.contains(i)==false){
                set.add(i);
            }
        }
        System.out.println(set.size());
    }
}
