package t1;

import java.util.Scanner;

/**
 * @Auther: hsx
 * @Date: 2020/3/2
 * @Description: t1
 * @version: 1.0
 */
public class tt1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        String str=String.valueOf(num);
        StringBuilder sb =new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(sb.indexOf(str.substring(i,i+1))==-1){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(Integer.valueOf(sb.toString()));
    }
}
